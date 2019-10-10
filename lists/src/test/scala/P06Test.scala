import org.scalatest.{BeforeAndAfter, FunSuite}

class P06Test extends FunSuite with BeforeAndAfter {


  test("should return true") {
    val input = List(1, 2, 3, 2, 1)
    assert(P06.isPalindrome(input))
  }

  test("should return false") {
    val input = List(1, 2, 3, 3, 1)
    assert(P06.isPalindrome(input)==false)
  }
}
