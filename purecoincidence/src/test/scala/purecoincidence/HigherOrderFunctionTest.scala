package purecoincidence

import munit.FunSuite
import HigherOrderFunction._

class HigherOrderFunctionTest extends FunSuite {
  test("triple") {
    assert(triple(2) == multiple(3)(2))
  }
}
