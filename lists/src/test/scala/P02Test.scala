import org.scalatest.{BeforeAndAfter, FunSuite}

class P02Test extends FunSuite with BeforeAndAfter {

  var input: List[Int] = _

  before {
    input = List(1, 1, 2, 3, 5, 8)
  }

  test("should return 2nd last value") {
    assert(P02.get2ndLast(input) == 5)
    assert(P02.builtInGet2ndLast(input) == 5)
    assert(P02.builtInNthLastElem(input, 2) == 5)
    assert(P02.getNthLastElem(input, 2) == 5)
  }

  test("should throw exception") {
    intercept[NoSuchElementException] {
      P02.get2ndLast(Nil)
      P02.builtInGet2ndLast(Nil)
      P02.builtInNthLastElem(Nil, 2)
      P02.builtInNthLastElem(input, -1)
      P02.builtInNthLastElem(input, 7)

      P02.getNthLastElem(Nil, 2)
      P02.getNthLastElem(Nil, 7)
      P02.getNthLastElem(input, 7)
    }


    intercept[IllegalArgumentException] {
      P02.getNthLastElem(input, -1)
    }
  }
}
