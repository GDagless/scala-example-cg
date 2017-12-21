import org.scalatest.FlatSpec

class FruitShopTest extends FlatSpec {

  it should "sum 2 apples and 3 oranges to 110" in {
      assert(FruitShop.total(List("orange", "apple", "apple", "orange", "orange")) == 110)
  }

  "FruitShop.formatOutput" should "output £0.70" in {
      assert(FruitShop.formatOutput(70) == "£0.70")
  }
  
  "Fruit.addToTotal" should "discount 2nd apple" in {
    var apple = new Fruit(60, 2)
    apple.addToTotal(0)
    assert(apple.addToTotal(60) == 60)
  }
  
  "Fruit.addToTotal" should "discount 3rd orange" in {
    var orange = new Fruit(25, 3)
    orange.addToTotal(0)
    orange.addToTotal(25)
    assert(orange.addToTotal(50) == 50)
  }
}