/**
 * This program compares numbers and returns them.
 *@author Kaffeein Bellamy
 *@version 30/9/2019
 */
public class NumberOperations {

   private int number;
   /**
    * Here are the methods that calculate.
    *@param numberIn changes number.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
    *Method gets number.
    *@return number gives number's value.
    */ 
   public int getValue() {
      return number;
   }
   /**
    *Method compares odd numbers.
    *@return output prints out list of numbers.
    */ 
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";   
         }
         i++;
      }
      return output;
   }
   /**
    *Method compares even exponents.
    *@return output prints out list of numbers.
    */ 
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
    *Method compares integers.
    *@param compareNumber is compared to the first number.
    *@return output prints a number based on parameters
    */ 
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      
      else if (number < compareNumber) {
         return -1;
      }
      
      else {
         return 0;
      }
   }
    /**
    *Method compares odd numbers.
    *@return number prints original number.
    */ 
   public String toString() {
      return number + "";
   }
}