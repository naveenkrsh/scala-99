import org.scalatest.{BeforeAndAfter, FunSuite}

class P01Test extends FunSuite with BeforeAndAfter {

  var input : List[Int] = _

  before
  {
    input = List(1, 1, 2, 3, 5, 8)
  }

  test("should return last element")
  {
    assert(P01.last(input)==8)
    assert(P01.builtInLast(input)==8)
  }


  test("should throw exception")
  {
    intercept[NoSuchElementException] {
      P01.last(Nil)
    }

    intercept[NoSuchElementException] {
      P01.builtInLast(Nil)
    }
  }
}
