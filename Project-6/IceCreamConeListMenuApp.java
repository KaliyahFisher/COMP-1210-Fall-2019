import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * This program formats multiple ice cream cones.
 *@author Kaffeein Bellamy
 *@version 10/4/2019
 */
public class IceCreamConeListMenuApp {
      /**
      * This program reads ice cream in.
      *@throws FileNotFoundException for missing file
      *@param args (Command line args not used)
      */  
   public static void main(String[] args) throws FileNotFoundException {
    
      String nameless = "*** no list name assigned ***";
      ArrayList<IceCreamCone> mango = new ArrayList<IceCreamCone>();
      String fileName = "";
      
      IceCreamConeList berry = new IceCreamConeList(nameless, mango);
      
      String label;
      double radius;
      double height;
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("IceCreamCone List System Menu"
         + "\nR - Read File and Create IceCreamCone List"
         + "\nP - Print IceCreamCone List"
         + "\nS - Print Summary"
         + "\nA - Add IceCreamCone"
         + "\nD - Delete IceCreamCone"
         + "\nF - Find IceCreamCone"
         + "\nE - Edit IceCreamCone"
         + "\nQ - Quit");
      
         
      
      char choice = 'Q';
      do {
         System.out.print("\nEnter Code [R, P, S, A, D, F, E, or Q]: ");
           
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
               
            case 'R':
               
               System.out.print("\tFile Name: ");
               fileName = userInput.nextLine();
       
              
               berry = berry.readFile(fileName);
            
               
               System.out.println("\tFile read in and IceCreamCone "
                  +  "List created");
              
               break;
               
            case 'P':
               
               System.out.print(berry);
               break;
               
            case 'S':
              
               System.out.print("\n" + berry.summaryInfo() + "\n");
               break;
               
            case 'A':
             
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
             
               
               berry.addIceCreamCone(label, radius, height);
               System.out.print("\t*** IceCreamCone added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
             
               label = userInput.nextLine();
               //does not print in original case
               IceCreamCone apple = berry.deleteIceCreamCone(label);
               if (apple != null) {
                  //here to get the right label for the delete statement, 
                  //"dot-method" the name of the object   
                  //inside and the getter
                  System.out.print("\t\"" + apple.getLabel()
                     + "\"" + " deleted\n");

               }
               else {
                  System.out.print("\t\"" + label + "\"" + " not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine().trim();
               IceCreamCone kiwi = berry.findIceCreamCone(label);
               if (kiwi != null) {
                  //it adds the object but it prints everything
                  //how to print just the one with that label?
                  System.out.print(kiwi + "\n");
               }
               
               else {
                  System.out.print("\t\"" + label + "\"" + " not found\n");
               }
               break;
               
              
            case 'E':
            
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
            
               boolean rocky = berry.editIceCreamCone(label, radius, height);
               
               // call the method from IceCreamConeList.java
               
               if (rocky) {                     
                  System.out.print("\t\""
                  //WEBCAT Error with output, Line 12, first character
                     +  label
                     + "\"" + " successfully edited\n");
                     
               }
               //berry.editIceCreamCone(label, radius, height);
               
               else {
                  System.out.print("\t\"" + label + "\"" + " not found\n");
               }
               
            
            case 'Q':
            
               break;
               
            default:
               System.out.println("\t*** invalid code ***");
         }
      
      } while (choice != 'Q');
           
   }
}