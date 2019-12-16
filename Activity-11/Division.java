/**
* This is the driver for the Division class.
*@author Kaffeein Bellamy
*@version 11/18/2019
*/
public class Division {
//you forgot to add static to methods
//static allows you to call them in terms of the class name
//without creating an object

/**
*@param numerator for division
*@param denominator for division
*@return result is answer
*/
   public static int intDivide(int numerator, int denominator) {
      //int result = numerator / denominator;
      
      try {
         return numerator / denominator;   
      }
      catch (ArithmeticException e)  {
         return 0;
      }
   }
/**
*@param numerator for division
*@param denominator for division
*@return result is answer
*/   
   public static float decimalDivide(int numerator, int denominator) {
      float result = (float) numerator / denominator;
      
      
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator "
                  + "cannot be zero.");

      }
      return result;      
   }
}