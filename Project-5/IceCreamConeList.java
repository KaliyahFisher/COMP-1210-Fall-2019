import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * This program formats multiple ice cream cones.
 *@author Kaffeein Bellamy
 *@version 10/4/2019
 */
public class IceCreamConeList {
   /**
    * This formats ice cream.
    */
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
      
}