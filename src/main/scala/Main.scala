object Main extends App{
  val shoppingList:List[Product] =List(Apple(),Orange())
  println(f"£${Till.getTotalCost(shoppingList)}%1.2f")
  val shoppingList2:List[Product] =List(Apple(),Apple(),Orange(),Orange(),Orange())
  println(f"£${Till.getTotalCost(shoppingList2)}%1.2f")
}
