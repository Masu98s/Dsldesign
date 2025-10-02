// (c) dsldesign, wasowski, tberger

package dsldesign.cmd

import org.scalatest.matchers.should.Matchers
import org.scalatest.freespec.AnyFreeSpec
import scala.util.Try
import java.io.File

class GenerateModelCodeSpec
  extends AnyFreeSpec, Matchers:

  val fsmJava = File ("../dsldesign.fsm/src/dsldesign/fsm/FiniteStateMachine.java")
  val fsmGenmodel = "dsldesign.fsm/model/fsm.genmodel"
  val platform = ".."
  val generator = GenerateModelCode (fsmGenmodel, platform)

  "generate FSM model code and check that files are indeed produced" - {

    "cleaning directories works" in {
      fsmJava.getParentFile ().mkdirs ()
      fsmJava.createNewFile ()
      fsmJava should exist
      generator.clean
      fsmJava shouldNot exist
    }

    "generator creates files in src/dsldesign/fsm/" in {
      Try (generator.clean.generate) shouldBe Symbol ("success")
      fsmJava should exist
      generator.clean // don't affect the main script by build tests
      fsmJava shouldNot exist
    }

  }
