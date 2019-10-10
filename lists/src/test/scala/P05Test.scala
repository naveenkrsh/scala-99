import org.scalatest.{BeforeAndAfter, FunSuite}

class P05Test extends FunSuite with BeforeAndAfter {

  var input: List[Int] = _
  before {
    input = List(1, 1, 2, 3, 5, 8)
  }

  test("should reverse list") {
    val reverseList = List(8, 5, 3, 2, 1, 1)
    assert(P05.builtInReverse(input) == reverseList)
    assert(P05.reverseR(input) == reverseList)
    assert(P05.reverseTailR(input) == reverseList)
    assert(P05.reverseFunctional(input) == reverseList)
  }
}
