package tests
import org.scalatest._


class ExampleSpec extends FlatSpec {
  val system = new System

  "2" should "be 2" in {
    assert(system.two == 2)
  }

  it should "be 3 too" in {
    assert(system.three == 3)
  }
}
