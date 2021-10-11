package purecoincidence

import munit.FunSuite

class HigherOrderFunctionTest extends FunSuite with HigherOrderFunction {
  test("triple") {
    assert(triple(2) == multiple(3)(2))
  }
}
