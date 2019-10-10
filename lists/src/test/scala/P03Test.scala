import org.scalatest.{BeforeAndAfter, FunSuite}

class P03Test extends FunSuite with BeforeAndAfter {

  var input: List[Int] = _
  before {
    input = List(1, 1, 2, 3, 5, 8)
  }

  test("should return kth elem") {
    assert(P03.builtInGetKthElem(input, 2) == 2)
    assert(P03.getKthElem(input, 2) == 2)

    assert(P03.builtInGetKthElem(input, 0) == 1)
    assert(P03.getKthElem(input, 0) == 1)
  }

  test("should throw exception") {

    intercept[NoSuchElementException] {
      P03.getKthElem(input, 10)
      P03.getKthElem(input, -1)
      P03.builtInGetKthElem(input, -1)
    }
  }
}
