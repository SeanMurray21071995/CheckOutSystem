object Main extends App{
  val shoppingList:List[Product] =List(Apple(),Orange())
  println(f"£${Till.getTotalCost(shoppingList)}%1.2f")
}
