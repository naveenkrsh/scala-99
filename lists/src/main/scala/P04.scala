//P04 (*) Find the number of elements of a list.
//  Example:
//  scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6

object P04 {
  def builtInLength[A](ls: List[A]): Int = {
    ls.length
  }

  def lengthR[A](ls: List[A]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lengthR(tail)
  }

  def lengthTailR[A](ls: List[A]): Int = {
    def length[A](ls: List[A], count: Int): Int = ls match {
      case Nil => count
      case _ :: tail => length(tail, count + 1)
    }

    length(ls, 0)
  }

  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) {
    (c, _) => c + 1
  }
}


