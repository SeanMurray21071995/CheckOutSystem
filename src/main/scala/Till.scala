object Till {
  def getTotalCost(items: List[Product]):Double={
    var discount:Double = 0
    discount = discount+getDiscount(Apple(),items.groupBy(_.getClass.getName).mapValues(_.size).get("Apple")
      match {case Some(x)=>x/2 case _=>0})
    discount =discount+ getDiscount(Orange(),items.groupBy(_.getClass.getName).mapValues(_.size).get("Orange")
      match{case Some(x)=>x/3 case _=>0})
    items.map(item => item.price).sum-discount
  }
  def getDiscount(fruit: Product, discountCycle:Int, totalDiscount: Double=0):Double =  {
    if(discountCycle == 0)
      totalDiscount
    else
      fruit match {
        case _:Apple  => getDiscount(Apple(), discountCycle-1, totalDiscount+0.60)
        case _:Orange => getDiscount(Orange(), discountCycle-1, totalDiscount+0.25)
      }
  }
}
