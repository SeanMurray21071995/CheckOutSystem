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
  "apple and 1 discount is passed" should "return the discount of 0.60" in {
    assertResult(0.60){
      Till.getDiscount(Apple(),1)
    }
  }
  "orange and 1 discount is passed" should "return the discount of 0.25" in {
    assertResult(0.25){
      Till.getDiscount(Orange(),1)
    }
  }
  "apple and 4 discount is passed" should "return the discount of 2.40" in {
    assertResult(3.00){
      Till.getDiscount(Apple(),5)
    }
  }
  "orange and 4 discount is passed" should "return the discount of 1.0" in {
    assertResult(1.25){
      Till.getDiscount(Orange(), 5)
    }
  }
  "2 apples passed" should "return the total with the discount 0.60" in {
    assertResult(0.60){
      val shoppingList: List[Product]=List(Apple(),Apple())
      Till.getTotalCost(shoppingList)
    }
  }
  "2 oranges passed" should "return the total with the discount 0.25" in {
    assertResult(0.50){
      val shoppingList: List[Product]=List(Orange(),Orange(),Orange())
      Till.getTotalCost(shoppingList)
    }
  }
}
