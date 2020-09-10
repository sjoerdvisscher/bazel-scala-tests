package tests

import org.specs2.mutable.SpecWithJUnit

class ExampleS2Test extends SpecWithJUnit {
  "system2" should {
    "return 2" in {
      (new System2).two mustEqual 2
    }
  }

}
