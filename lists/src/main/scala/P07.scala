//P07 (**) Flatten a nested list structure.
//Example:
//  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//res0: List[Any] = List(1, 1, 2, 3, 5, 8)
object P07 {

  def flatten[Any](ls: List[Any]): List[Any] = ls.flatMap({
      case ms: List[Any] => flatten(ms)
      case e =>  List(e)
    })
}
