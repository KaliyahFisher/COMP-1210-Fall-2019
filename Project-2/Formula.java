import java.util.Scanner;
/**
 * This program calculates the input of a stored formula.
 * @Kaffeein Bellamy
 * @version 5/9/2019
 */
public class Formula {
/**
 * Program calculates numbers.
 * @param args Command line arguments (not used).
 */
   public static void main(String [] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x = 0;
      double y = 0;
      double z = 0;
      
      System.out.println("result = (3x + 10.5) (2y + 7.5) (z + 5.5) / xyz");
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      double result = ((3 * x) + 10.5) * ((2 * y) + 7.5) * (z + 5.5);
      double xyz = (x * y * z);
      if (xyz == 0) {
         result = 0;
      }
      else {
         result = result / xyz;
      }
      System.out.print("result = " + result);
      
   }
}