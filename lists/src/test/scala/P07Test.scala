import org.scalatest.{BeforeAndAfter, FunSuite}

class P07Test extends FunSuite with BeforeAndAfter {


  test("should flatten list") {
    val input = List(List(1, 1), 2, List(3, List(5, 8)))

    val expected_result = List(1, 1, 2, 3, 5, 8)
    assert(P07.flatten(input)==expected_result)
  }


}