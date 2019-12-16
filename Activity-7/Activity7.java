/**
 * This program calculates number averages.
 *@author Kaffeein Bellamy
 *@version 10/14/2019
 */
public class Scores {
   private int[] numbers;
   /**
    *Calculates numbers.
    *@param numbersIn changes numbers
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
    /**
    * Find the even numbers.
    *@return evens gives back evens
    */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {

         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }

      int[] evens = new int[numberEvens];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
    /**
    * Find the odds numbers.
    *@return odds gives back odds
    */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
    /**
    *Divide sum by array size.
    *@return average
    */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (double) sum / (double) numbers.length;
   }
    /**
    *Prints array.
    *@return result is the array forward
    */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result  += numbers[i] + "\t";
      }
      return result;
   }
    /**
    *Prints array.
    *@return result is the array backwards
    */   
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
      
   }
        
}