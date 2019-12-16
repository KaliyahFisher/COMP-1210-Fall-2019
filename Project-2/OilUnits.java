import java.util.Scanner;
/**
 * This program calculates the amount of oil in various units.
 * @author Kaffeein Bellamy
 * @version 5/9/2019
 */ 
public class OilUnits {
/**
 * Program calculates numbers.
 * @param args Command line arguments (not used).
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);  
      int oil = 0;
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int ounces = 0;
      
      System.out.print("Enter amount of oil in ounces: ");
      oil = userInput.nextInt();
    
      if (oil > 1000000000) {
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      
      // algorithm: divide oil ounces by ounces in barrel (5376); 
      // this is number of barrels as an int
      // take the remainder (561) and divide by 128
      else {
         barrels = oil / 5376; // Value starts at 10.10435
         oil = oil % 5376;
         
         gallons = oil / 128;
         oil = oil % 128;
         
         quarts = oil / 32;
         oil = oil % 32;
         
          ounces = oil;
         // double to int conversion 
         // declare the double first like so:
         // double d = 10.5
         // next, declare a new int value with a different name
         // set the new int value to (int) and type the double next to it
         // int i = (int)d
         System.out.println("Oil amount in units: ");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         
         oil = (barrels * 5376 + gallons * 128 + quarts * 32 + ounces);
         
         System.out.println(oil + " oz = (" + barrels + " bl * 5376 oz) + (" + gallons + " gal * 128 oz) + (" + quarts + " qt * 32 oz) + (" + ounces + " oz)");
      
      }
   
   } 

}