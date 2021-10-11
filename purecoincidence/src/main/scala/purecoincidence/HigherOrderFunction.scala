package purecoincidence

trait HigherOrderFunction {
  def multiple(n: Int): Int => Int = x => x * n
  val triple: Int => Int = multiple(3)
  val square: Int => Int = x => x * x
}
