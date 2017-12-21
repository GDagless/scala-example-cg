

class Fruit (price: Int, offer: Int) {
  var count = 0
 
   def addToTotal(sum: Int): (Int) = {
      incrementCount()
      if (count % offer != 0){
         sum + price
      } else {
         sum
      }
                  
   }
                  
   def incrementCount() {
     count += 1
   }
                  
}