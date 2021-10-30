package purecoincidence

object HigherOrderFunction {
  def multiple(n: Int): Int => Int =
    x => x * n

  def pow(r: Int): Int => Int =
    x => List.fill(r)(x).product

  val triple: Int => Int = multiple(3)
  val square: Int => Int = pow(2)

  def main(args: Array[String]) =
    println((
      List(1, 2, 3, 4).map(triple compose square),
      List(1, 2, 3, 4).map(square).map(triple)
    ))     // => List(3, 12, 27, 48), ...
}