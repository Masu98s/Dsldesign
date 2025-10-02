// (c) dsldesign, wasowski, tberger

// A gradle task in Scala. Groovy had trouble finding GenerateModelCode.scala

import scala.jdk.CollectionConverters.*

import org.gradle.api.*
import org.gradle.api.tasks.*
import javax.inject.Inject

// The genmodel should be a path relative to the root of the platform

class GenerateModelCodeTask @Inject (genmodel: String)
  extends DefaultTask:

  val info = getProject.getLogger.info (_: String, Nil*)
  val root = getProject.getRootProject.getProjectDir.toString + "/"
  val generator = dsldesign.cmd.GenerateModelCode (genmodel, root, info)
  val genmodelPath = this.getProject.file (root + generator.genmodelPath)
  val ecorePath =
    for m <- generator.genmodel.getForeignModel.asScala
    yield getProject
        .file (root+generator.genmodelPath)
        .getParentFile
        .toString + "/" + m

  val codePath =
    for path <- generator.codePath
    yield this.getProject.file (root + path)

  info (s"GenerateModelCodeTask " +
        s"for '${genmodelPath}' " +
        s"into '${codePath.mkString (",")}'" +
        s"from ecore models '${ecorePath.mkString (",")}'")

  // setup outputs so that automatic clean tasks work
  for path <- codePath
  do getOutputs.dir (path)

  // setup inputs so that automatic dependencies work
  getInputs.file (genmodelPath)
  for ep <- ecorePath
  do getInputs.file (ep)

  this.setDescription (s"Generate model code for ${genmodel}")

  @TaskAction
  def taskAction () = generator.clean.generate
