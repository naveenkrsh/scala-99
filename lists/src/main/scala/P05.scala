//P05 (*) Reverse a list.
//Example:
//  scala> reverse(List(1, 1, 2, 3, 5, 8))
//res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object P05 {
  def builtInReverse[A](ls: List[A]): List[A] = ls.reverse

  def reverseR[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => reverseR(tail) ::: List(h)
  }

  def reverseTailR[A](ls: List[A]): List[A] = {
    def reverse[A](result: List[A], current: List[A]): List[A] = current match {
      case Nil => result
      case h :: tail => reverse(h :: result, tail)
    }
    reverse(Nil,ls)
  }
  def reverseFunctional[A](ls:List[A]):List[A]= ls.foldLeft(List[A]()){
    (res,h)=> h::res
  }
}
