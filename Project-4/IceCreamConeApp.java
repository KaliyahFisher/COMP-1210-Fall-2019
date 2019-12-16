import java.util.Scanner;
/**
 *This program contains the user data for IceCreamCone.java.
 *@author Kaffeein Bellamy
 *@version 13/9/2019
 */
public class IceCreamConeApp {
/**
 *Program feeds data to IceCreamCone.
 *@param args Command line arguments (not used).
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double radius = 0;
      double height = 0;
      String label = "";
      
      IceCreamCone iceCreamCone1 = new IceCreamCone(label, radius, height);   
      System.out.println("Enter label, radius, and height for an "  
         + "ice cream cone.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tradius: ");
      radius = Double.parseDouble(userInput.nextLine());
      
      if (radius <= 0) {
         System.out.print("Error: radius must be greater than 0." + "\n");
      }
   
      else {
         System.out.print("\theight: ");
         height = Double.parseDouble(userInput.nextLine());
         if (height <= 0) {
            System.out.print("Error: height must be greater than 0.");
         }
         else {
            IceCreamCone myObj = new IceCreamCone(label, radius, height);
            System.out.print("\n" + myObj);
         }
      }
   }
}