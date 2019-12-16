import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * This program prints multiple ice cream cones.
 *@author Kaffeein Bellamy
 *@version 10/4/2019
 */
public class IceCreamConeListApp {
      /**
       * Let's print some ice cream!
       */
   public static void main(String[] args) throws FileNotFoundException {

      ArrayList<IceCreamCone> cones = new ArrayList<IceCreamCone>();  
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter file name: ");
      
      String fileName = userInput.nextLine();

      Scanner s = new Scanner(new File(fileName));
      System.out.print("\n");
      String listName = s.nextLine();
      
      while (s.hasNext()) {
         String label = s.nextLine();
         double radius = Double.parseDouble(s.nextLine());
         double height = Double.parseDouble(s.nextLine());
         IceCreamCone cone = new IceCreamCone(label, radius, height);
         cones.add(cone);
      }
      
      IceCreamConeList iList = new IceCreamConeList(listName, cones);
      System.out.println(iList);
      System.out.println("\n" + iList.summaryInfo());
   }
}