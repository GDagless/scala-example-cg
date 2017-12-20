

object Checkout {
  def total(inputList:List[String]){
            // The list of fruits/prices should be generated externally and imported. e.g. property file
          val fruits = Map("orange" -> 25, "apple" -> 60)
      var sum = 0
      for (item <- inputList) {
            println(item)  
            sum += fruits(item)
     }
  }

}