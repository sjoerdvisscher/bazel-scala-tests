package com.github.sjoerdvisscher.coverage

import org.scalatest._


class ExampleSpec extends FlatSpec {
  val works = new Works

  "Works" should "be 2" in {
    assert(works.two == 2)
  }

  it should "be 3 too" in {
    assert(works.three == 3)
  }

  val fails = new Fails

  "Fails" should "be 2" in {
    assert(fails.two == 2)
  }

  it should "be 3 too" in {
    assert(fails.three == 3)
  }

}
