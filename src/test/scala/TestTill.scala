import org.scalatest.FlatSpec
class TestTill extends FlatSpec {
"1 apple is passed" should "return the total 0.60" in{
  assertResult(0.60){
    val shoppingList :List[Product]=List(Apple())
    Till.getTotalCost(shoppingList)
  }
}
  "1 orange is passed" should "return the total 0.25" in{
    assertResult(0.25){
      val shoppingList :List[Product]=List(Orange())
      Till.getTotalCost(shoppingList)
    }
  }
  "1 apple and 1 orange is passed" should "return the total 0.85" in {
    assertResult(0.85) {
      val shoppingList :List[Product]=List(Apple(),Orange())
      Till.getTotalCost(shoppingList)
    }
  }
  "nothing is passed" should "return 0" in {
    assertResult(0){
      val shoppingList: List[Product]=List()
      Till.getTotalCost(shoppingList)
    }
  }
}
