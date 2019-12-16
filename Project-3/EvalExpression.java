import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * This program calculates a number chosen by the user.
 *@author Kaffeein Bellamy
 *@version 12/9/2019
 */
public class EvalExpression {
   /**
    * Program calculates a number.
    *@param args Command line arguments (not used).
    */
   public static void main(String [] args) {

      Scanner userInput = new Scanner(System.in);
      double x = 0;

      System.out.print("Enter a value for x: ");
         
   
      x = userInput.nextDouble();
      double resultPart1 = ((12.4 * Math.pow(x, 6)) - (1.2 * Math.pow(x, 3))); 
      double resultPart2 = Math.sqrt(Math.abs((2.6 * Math.pow(x, 5) 
         - (6.8 * x) + 7)));
      double resultPart3 = (Math.pow(x, 4) + 9);
      double result = (resultPart1 + resultPart2) / resultPart3;
      String resultStr = Double.toString(result);
      int dot = resultStr.indexOf(".");
      DecimalFormat df = new DecimalFormat("#,##0.0###");

      System.out.println("Result: " + result
         + "\n# of characters to left of decimal point: " 
         + resultStr.substring(0, dot).length()
         + "\n# of characters to right of decimal point: " 
         + resultStr.substring(dot + 1).length()
         + "\nFormatted Result: " + df.format(result));


   }
}