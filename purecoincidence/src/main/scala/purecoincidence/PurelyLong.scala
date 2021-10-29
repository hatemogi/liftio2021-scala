package purecoincidence

object PurelyLong extends App {
  def pure(a: Int, b: Int): Int =
    2*a*a + 3*b    // 2a^2 + 3b

  def expressionA(a: Int, b: Int): Int =
    4*a*a + pure(a, b) + 6*b

  def expressionB(a: Int, b: Int): Int =
    3 * pure(a, b)

  println((
    expressionA(3, 4),
    expressionB(3, 4)
  ))    // => (90,90)
}
