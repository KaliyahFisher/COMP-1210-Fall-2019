import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
/**
 * This program formats multiple ice cream cones.
 *@author Kaffeein Bellamy
 *@version 10/4/2019
 */
public class IceCreamConeList {
   private String listName;
   private ArrayList<IceCreamCone> cones;
   
   /**
    * constructor holds ice cream parameters.
    * @param listNameIn is the list name
    * @param conesIn counts cones
    */
   public IceCreamConeList(String listNameIn, ArrayList<IceCreamCone> conesIn) {
      listName = listNameIn;
      cones = conesIn;
   }
 /**
  *@return listName gives name of list
  */    
   public String getName() {
      return listName;
   }     
 /**
  *@return is number of objects in file
  */
   public int numberOfIceCreamCones() {
      return cones.size();
   }
 /**
 *@return surfaceAreaList adds all surface areas
 */      
   public double totalSurfaceArea() {         
      double surfaceAreaList = 0;
      int index = 0;
      while (index < cones.size()) {
         surfaceAreaList += cones.get(index).surfaceArea();
         index++;
      }
      if (cones.size() == 0) {
         return 0;    
      }
      else {
         return surfaceAreaList;
      }
   }
 /**
  *@return totalVolumeList adds all volumes
  */      
   public double totalVolume() {
      double totalVolumeList = 0;
      int index = 0;
      while (index < cones.size()) {
         totalVolumeList += cones.get(index).volume();
         index++;
      }
      
      if (cones.size() == 0) {
         return 0;    
      }
      else {
         return totalVolumeList;
      }
   }
      
 /**
  *@return averages surface areas
  */ 
   public double averageSurfaceArea() {
      if (cones.size() == 0) {
         return 0;    
      }
      else {
         return totalSurfaceArea() / cones.size();
      }
   }
      
 /**
  *@return averages volume
  */    
   public double averageVolume() {
      if (cones.size() == 0) {
         return 0;    
      }
      else {
         return totalVolume() / cones.size();
      }
   }

 /**
  *@return output formats cones for printing 
  */    
   public String toString() {
      String output = getName() + "\n";
      int index = 0;
      while (index < cones.size()) {
         output += "\n" + cones.get(index) + "\n"; 
         index++;  
      }   
      return output;
   }
 /**
  *@return summary prints ice cream cone data
  */    
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String summary = "----- Summary for " + getName() + " -----"
         + "\n Number of IceCreamCone Objects: " + numberOfIceCreamCones()
         + "\n Total Surface Area: " + df.format(totalSurfaceArea())
         + "\n Total Volume: " + df.format(totalVolume())
         + "\n Average Surface Area: " + df.format(averageSurfaceArea())
         + "\n Average Volume: " + df.format(averageVolume());
      return summary; 
   }
   /**
   *@return gives back that arrayList at the top
   */
   public ArrayList<IceCreamCone> getList() {
   
      return cones;
   }
   
   /**
   *@return gives an IceCreamConeList object created from file
   *@param fileNameIn is the file's name
   *@throws FileNotFoundException ignores missing file
   */
   public IceCreamConeList readFile(String fileNameIn) 
                                    throws FileNotFoundException {
      
      Scanner reader = new Scanner(new File(fileNameIn));         
      

      
      ArrayList<IceCreamCone> chocolate = new ArrayList<IceCreamCone>();
      String iListName = "";
   
      iListName = reader.nextLine();
      
      
      while (reader.hasNext()) {
         String label = reader.nextLine();
         double radius = Double.parseDouble(reader.nextLine());
         double height = Double.parseDouble(reader.nextLine());
         IceCreamCone peach = new IceCreamCone(label, radius, height);
         chocolate.add(peach);
      }
      
   
      IceCreamConeList strawberry = new IceCreamConeList(iListName, chocolate);
      //am I supposed to type the name of the list?
      //how to make this method return a string?
      return strawberry;
   }
   /**
   *@param labelIn is the name of the cone
   *@param radiusIn is the radius
   *@param heightIn is the height of the cone
   */
   public void addIceCreamCone(String labelIn, 
                                    double radiusIn, double heightIn) {
      IceCreamCone peach = new IceCreamCone(labelIn, radiusIn, heightIn);
      
      //this one adds the object to the list created at the beginning
      cones.add(peach);
   }
   /**
   *@param labelIn is the name of the cone
   *@return result for finding cone
   */
   public IceCreamCone findIceCreamCone(String labelIn) {
      //for each 
      for (IceCreamCone peach : cones) {
         //in the example program the get method comes from the triangle 
         if (peach.getLabel().equalsIgnoreCase(labelIn)) {
            return peach;
         }
      }
      return null;
   }
   /**
   *@param labelIn is the name of the cone
   *@return for finding cone
   */
   public IceCreamCone deleteIceCreamCone(String labelIn) {
      IceCreamCone result = null;
      for (int i = 0; i < cones.size(); i++) {
      
         //if (cones.getLabel().get(i).equalsIgnoreCase(labelIn)) {
         if (cones.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            result = cones.get(i);
            //int index = cones.indexOf(peach);
            cones.remove(i);
            //writing break below this deletes 
            //the ice cream cone before it...strange
            
            break;
         }
         
      }
      return result;
      
   }
   /**
   *@param labelIn is the name of the cone
   *@param radiusIn is the radius
   *@param heightIn is the height of the cone
   *@return for finding cone
   */
   public boolean editIceCreamCone(String labelIn, 
                                       double radiusIn, double heightIn) {
      boolean result = false;
      // fix boolean error by chaning (findIceCreamCone(labelIn) == true)
      // to (findIceCreamCone(labelIn))
      IceCreamCone banana = findIceCreamCone(labelIn); 
      if (banana != null) {
         banana.setRadius(radiusIn);
         banana.setHeight(heightIn);
         result = true;
      }
      return result;
   }
      
      
}
