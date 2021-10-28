package purecoincidence

object Purity extends App {
  def pure(a: Int, b: Int): Int =
    2*a*a + 3*b  // 2a^2 + 3b

  val p = pure(2, 3) // => 17

  println((
    p + p,
    pure(2, 3) + p,
    pure(2, 3) + pure(2, 3),
  ))

  var current: Int = 0
  def impure(n: Int): Int = {
    current += n
    current
  }

  val i = impure(2)

  println((
    i + i,
    impure(2) + i,
    impure(2) + impure(2)
  ))


  def pureLongExpressionA(a: Int, b: Int): Int =
    3*a*a + pure(a, b) + 4*b

  def pureLongExpressionB(a: Int, b: Int): Int =
    2 * pure(a, b) + 2 * b



}

