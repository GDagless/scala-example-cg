
object FruitShop {

  // The list of fruits/prices should be generated externally and imported. e.g. property file
	        val fruits = Map("orange" -> 25, "apple" -> 60)

	        // FruitShop takes a list of string values separated by spaces, e.g. apple orange apple
	        def main(args:Array[String]){
        	  println(formatOutput(total(args.toList)))
          }
          
          def total(inputList:List[String]) : (Int) = {
             var sum = 0
             for (item <- inputList) {
                sum += fruits(item)
             }
             sum
          }  
          
          def formatOutput(sum: Int) : (String) = {
            var cashValue = sum / 100.00
            "£%.2f".format(cashValue)     
          }

}