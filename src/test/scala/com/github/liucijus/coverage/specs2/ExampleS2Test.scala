package com.github.liucijus.coverage.specs2

import org.specs2.mutable.SpecWithJUnit

class ExampleS2Test extends SpecWithJUnit {
  "system2" should {
    "return 2" in {
      (new System).two mustEqual 2
    }
  }

}
