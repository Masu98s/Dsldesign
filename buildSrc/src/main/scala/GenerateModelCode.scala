// (c) dsldesign, wasowski, tberger

package dsldesign.cmd

import scala.jdk.CollectionConverters.*

import scala.util.Try
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.codegen.ecore.generator.Generator

import GenerateModelCode.*

case class GenerateModelCode (
  genmodelPath: String,         // relative to platform root
  platformPath: String = "..",  // relative to current directory
  logger: String => Unit = GenerateModelCode.log):

  def genmodelURI = s"platform:/resource/${genmodelPath}"

  org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri (platformPath)
  logger (s"Standalone setup completed, platformPath=${platformPath}")

  // A magic incantation to register genmodel's meta-model
  // cf. https://www.eclipse.org/forums/index.php/t/126755/
  org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage.eINSTANCE.eClass ()
  logger ("Ecore genmodel package registered.")

  val uri: URI = URI.createURI (genmodelURI)
  val resource: Resource = ResourceSetImpl ().getResource (uri, true)
  logger (s"Loading genmodel: ${genmodelPath}")
  val genmodel: GenModel =
     EcoreUtil.getAllProperContents[GenModel] (resource, false).next
  logger (s"Genmodel loaded: ${genmodelPath}")

  for p <- genmodel.getGenPackages.asScala
  do logger (s"base package: ${p.getBasePackage} prefix: ${p.getPrefix}")

  val codePath: Seq[String] =
    for p <- genmodel.getGenPackages.asScala.toSeq
    yield genmodel.getModelDirectory +"/"+
            p.getBasePackage
             .replace (".","/") + "/" + firstLower (p.getPrefix)

  def codeURI: Seq[String] =
    for s <- codePath
    yield s"platform:/resource/${s}"


  // Functions

  def clean: GenerateModelCode =
    for
      path <- this.codePath // If not there, then already empty
    do
      Try (org.eclipse.emf.mwe.utils.DirectoryCleaner ()
              .cleanFolder (platformPath + path))
      logger (s"Target directory cleaned: ${path}")
    this


  def generate: Unit =
    val generator = org.eclipse.emf.mwe2.ecore.EcoreGenerator ()
    generator.setGenModel (this.genmodelURI)
    for uri <- this.codeURI
    do generator.addSrcPath (uri)
    generator.invoke (null) // null fine as the generator ignores the arg
    logger ("Code generated")

end GenerateModelCode


object GenerateModelCode:

  def firstLower (s: String): String =
    s(0).toLower.toString + s.drop (1)

  def log (s: String) =
    println (s"dsldesign.cmd.GenerateModelCode: $s")
    Console.flush ()
