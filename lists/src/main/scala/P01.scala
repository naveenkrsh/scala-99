//P01 (*) Find the last element of a list.
//Example:
//  scala> last(List(1, 1, 2, 3, 5, 8))
//res0: Int = 8


object P01 {

  def builtInLast[A](list: List[A]): A = {
    list.last
  }

  def last[A](list: List[A]): A = list match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException

  }
}
