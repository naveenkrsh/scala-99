//
//P02 (*) Find the last but one element of a list.
//Example:
//  scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5

object P02 {

  def builtInGet2ndLast[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  //nth last element
  def builtInNthLastElem[A](ls: List[A], n: Int): A = {
    if (ls.isEmpty) throw new NoSuchElementException
    if (ls.length < n) throw new NoSuchElementException
    ls.takeRight(n).head
  }

  def get2ndLast[A](ls: List[A]): A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => get2ndLast(tail)
    case _ => throw new NoSuchElementException

  }

  def getNthLastElem[A](ls: List[A], n: Int): A = {
    def getNthElem(count: Int, result: List[A], current: List[A]): A =
      current match {
        case Nil if count > 0 => throw new NoSuchElementException
        case Nil => result.head
        case _ :: tail => getNthElem(count - 1,
          if (count > 0) result else result.tail
          , tail)
      }

    if (n < 0) throw new IllegalArgumentException
    else getNthElem(n, ls, ls)
  }
}
