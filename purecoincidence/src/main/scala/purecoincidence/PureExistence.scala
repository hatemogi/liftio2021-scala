package purecoincidence

object PureExistence extends App {
  def divide0(x: Int, y: Int): Int = x / y

  divide0(8, 2)
  divide0(6, 3)
//  divide0(3, 0) // => ArithmeticException

  def divide1(x: Int, y: Int): Int = {
    assert(y != 0)
    x / y
  }

  def divide2(x: Int, y: Int): Int = {
    if (y == 0) -1
    else x / y
  }

  def divide3(x: Int, y: Int): (Int, Boolean) =
    if (y == 0) (0, false)
    else (x / y, true)

  def divide(x: Int, y: Int): Option[Int] =
    if (x == 0) None
    else Some(x / y)

  def parseInt(s: String): Option[Int] =
    try {
      Some(s.toInt)
    } catch {
      case _: NumberFormatException => None
    }

  def stringDivide0(sx: String, sy: String): Option[Int] =
    parseInt(sx).flatMap { x =>
      parseInt(sy).flatMap { y =>
        divide(x, y)
      }
    }

  def stringDivide(sx: String, sy: String): Option[Int] =
    for {
      x <- parseInt(sx)
      y <- parseInt(sy)
      d <- divide(x, y)
    } yield d

}
