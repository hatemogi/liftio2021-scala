package purecoincidence

object Impurity extends App {
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
  ))  // (4,6,14)
}


