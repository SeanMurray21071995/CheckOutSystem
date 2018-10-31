object Till {
  def getTotalCost(items: List[Product]):Double={
    items.map(item => item.price).sum
  }
}
