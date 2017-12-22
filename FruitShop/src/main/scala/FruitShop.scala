
object FruitShop {

  // The list of fruits/prices should be generated externally and imported. e.g. property file
	        val fruitPrices = Map("orange" -> 25, "apple" -> 60)
	        // assumption: all offers are of the buy x get 1 free variety
          val bogof = 2
          val threeForTwo = 3
	        val offers = Map("orange" -> threeForTwo, "apple" -> bogof)
	        var fruitMap = collection.mutable.Map[String, Fruit]()
	        for (key <- fruitPrices.keySet) {
	          fruitMap += (key -> new Fruit(fruitPrices(key), offers(key)))
	        }

	        // FruitShop takes a list of string values separated by spaces, e.g. apple orange apple
	        def main(args:Array[String]){
        	  println(formatOutput(total(args.toList)))
	        }
          
          def total(inputList:List[String]) : (Int) = {
             var sum = 0
             for (item <- inputList) {
                var fruit = fruitMap.apply(item)
               	sum = fruit.addToTotal(sum)
             }
             sum
          }  
          
          def formatOutput(sum: Int) : (String) = {
            "£%.2f".format(sum / 100.00)     
          }

}
