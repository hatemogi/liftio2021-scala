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
}

