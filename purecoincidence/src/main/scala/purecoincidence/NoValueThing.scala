package purecoincidence

object NoValueThing {
  def divideA(x: Int, y: Int): Int = x / y

  divideA(8, 2)
  divideA(6, 3)
  //  divideA(3, 0) // => ArithmeticException

  def divideB(x: Int, y: Int): Int = {
    assert(y != 0)
    x / y
  }

  def divideC(x: Int, y: Int): Int = {
    if (y == 0) -1 // or 'null'
    else x / y
  }

  def divideD(x: Int, y: Int): (Int, Boolean) =
    if (y == 0) (0, false)
    else (x / y, true)

  def divide(x: Int, y: Int): Option[Int] =
    if (y == 0) None
    else Some(x / y)
}