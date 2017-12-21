import org.scalatest.FlatSpec

class FruitShopTest extends FlatSpec {

  "FruitShop.total" should "sum 3 apples to 120" in {
      assert(FruitShop.total(List("apple", "apple", "apple")) == 120)
  }

  it should "sum 4 oranges to 75" in {
      assert(FruitShop.total(List("orange", "orange", "orange", "orange")) == 75)
  }

  it should "sum 2 apples and 2 oranges to 110" in {
      assert(FruitShop.total(List("orange", "apple", "apple", "orange")) == 110)
  }

  "FruitShop.formatOutput" should "output £0.70" in {
      assert(FruitShop.formatOutput(70) == "£0.70")
  }
}