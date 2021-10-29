package purecoincidence

object HigherLevel extends App {
  def factA(n: Int): Int = {
    var r = 1
    for {
      i <- 1 to n
    } r *= i
    r
  }

  def factB(n: Int): Int =
    if (n <= 1) 1
    else n * factB(n - 1)

  def factC(n: Int): Int =
    (1 to n).product

  println((
    factA(5),
    factB(5),
    factC(5)
  ))  // => (120,120,120)
}




