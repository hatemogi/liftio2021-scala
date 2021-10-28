package purecoincidence

trait HigherOrderFunction {
  def multiple(n: Int): Int => Int =
    x => x * n

  def exp(r: Int): Int => Int =
    x => List.fill(r)(x).product

  val triple: Int => Int = multiple(3)

  val square: Int => Int = exp(2)


}
