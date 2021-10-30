package purecoincidence

object PureExistence extends App {
  def divide(x: Int, y: Int): Option[Int] =
    if (y == 0) None
    else Some(x / y)

  def parseInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case _: NumberFormatException => None
    }   // == scala.util.Try(s.toInt).toOption
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