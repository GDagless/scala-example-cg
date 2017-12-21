

object FruitShop {

  // The list of fruits/prices should be generated externally and imported. e.g. property file
	        val fruitPrices = Map("orange" -> 25, "apple" -> 60)
	        // assumption: all offers are of the buy x get 1 free variety
          val bogof = 2
          val threeForTwo = 3
	        val offers = Map("orange" -> threeForTwo, "apple" -> bogof)
	        val apple = new Fruit(fruitPrices("apple"), offers("apple"))
	        val orange = new Fruit(fruitPrices("orange"), offers("orange"))

	        // FruitShop takes a list of string values separated by spaces, e.g. apple orange apple
	        def main(args:Array[String]){
        	  println(formatOutput(total(args.toList)))
	        }
          
          def total(inputList:List[String]) : (Int) = {
             var sum = 0
             for (item <- inputList) {
                var fruit = item match {
                  case "apple" => apple
                  case "orange" => orange
                }
                	sum = fruit.addToTotal(sum)
             }
             sum
          }  
          
          def formatOutput(sum: Int) : (String) = {
            var cashValue = sum / 100.00
            "£%.2f".format(cashValue)     
          }

}
