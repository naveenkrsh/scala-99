//P03 (*) Find the Kth element of a list.
//By convention, the first element in the list is element 0.
//Example:
//
//  scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2

object P03 {

  def builtInGetKthElem[A](ls: List[A], k: Int): A = {
    if (k < 0) throw new NoSuchElementException
    ls(k)
  }

  def getKthElem[A](ls: List[A], k: Int): A =
    (k, ls) match {
      case (0, h :: _) => h
      case (k, _ :: tail) => getKthElem(tail, k - 1)
      case (_, Nil) => throw new NoSuchElementException
    }
}
