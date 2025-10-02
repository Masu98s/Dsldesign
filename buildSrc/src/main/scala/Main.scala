// (c) dsldesign, wasowski, tberger

package dsldesign.cmd

@main
def main (args: String*) =
  args match
  case Seq (genmodel) =>
    GenerateModelCode (genmodel)
      .clean
      .generate
  case Seq (genmodel, platform) =>
    GenerateModelCode (genmodel,platform)
      .clean
      .generate
  case _ =>
    GenerateModelCode.log ("""
      |Usage:   GenerateModelCode genmodel_uri
      |Example: ./GenerateModelCode dsldesign.fsm/model/fsm.genmodel
      |
      |The invocation should be done from within an Eclipse Workspace,
      |probably in a root directory of a project in the same workspace
      |where the platform URI is referring to.
      |""".stripMargin)
