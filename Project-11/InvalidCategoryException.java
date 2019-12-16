/**
 * This is the driver for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */
             
public class InvalidCategoryException  extends Exception {
   /**
    *@param categoryIn for category char
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);

   }
}