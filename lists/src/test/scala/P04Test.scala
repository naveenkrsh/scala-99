import org.scalatest.{BeforeAndAfter,FunSuite}

class P04Test extends FunSuite with BeforeAndAfter {

  var input : List[Int]=_
  before{
    input = List(1, 1, 2, 3, 5, 8)
  }

  test("should return length")
  {
    assert(P04.builtInLength(input)==6)
    assert(P04.lengthR(input)==6)
    assert(P04.lengthTailR(input)==6)
    assert(P04.lengthFunctional(input)==6)
  }
}
