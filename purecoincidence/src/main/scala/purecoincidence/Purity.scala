package purecoincidence

object Purity extends App {
  def pure(a: Int, b: Int): Int =
    2*a*a + 3*b    // 2a^2 + 3b

  val p = pure(2, 3)   // => 17

  println((
    p + p,
    pure(2, 3) + p,
    pure(2, 3) + pure(2, 3),
  ))    // => (34,34,34)

  def pureLongExpressionA(a: Int, b: Int): Int =
    4*a*a + pure(a, b) + 6*b

  def pureLongExpressionB(a: Int, b: Int): Int =
    3 * pure(a, b)

  println((
    pureLongExpressionA(3, 4),
    pureLongExpressionB(3, 4)
  ))    // => (90,90)
}

