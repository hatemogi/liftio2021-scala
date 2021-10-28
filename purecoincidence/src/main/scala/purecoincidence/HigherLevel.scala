package purecoincidence

object HigherLevel extends App {
  def fact0(n: Int): Int = {
    var r = 1
    for {
      i <- 1 to n
    } r *= i
    r
  }

  def fact1(n: Int): Int =
    if (n <= 1) 1
    else n * fact1(n - 1)

  def fact2(n: Int): Int =
    (1 to n).product

  println((
    fact0(5),
    fact1(5),
    fact2(5)
  ))
}
