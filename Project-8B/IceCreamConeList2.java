import java.text.DecimalFormat;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
/**
 * This program formats multiple ice cream cones.
 *@author Kaffeein Bellamy
 *@version 10/4/2019
 */
public class IceCreamConeList2 {
   private String listName;
   private IceCreamCone[] alphaList;
   private int numberOfCones;
   
   /**
    * constructor holds ice cream parameters.
    * @param listNameIn is the list name
    * @param alphaListIn feeds array
    * @param numberOfConesIn counts cones
    */
   public IceCreamConeList2(String listNameIn, IceCreamCone[] alphaListIn, 
                              int numberOfConesIn) {
      listName = listNameIn;
      alphaList = alphaListIn;
      numberOfCones = numberOfConesIn;
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
      return numberOfCones;
   }

 /**
 *@return surfaceAreaSum adds all surface areas
 */   
   public double totalSurfaceArea() {
      double surfaceAreaSum = 0;
      
      for (int i = 0; i < numberOfCones; i++) {
         surfaceAreaSum += alphaList[i].surfaceArea();
      }
      return surfaceAreaSum;
   }
 /**
  *@return totalVolumeList adds all volumes
  */      
   
   public double totalVolume() {
      double volumeSum = 0;
      
      for (int i = 0; i < numberOfCones; i++) {
         volumeSum += alphaList[i].volume();
      }
      return volumeSum;
   }
      
 /**
  *@return averages surface areas
  */ 
   public double averageSurfaceArea() {
      if (numberOfCones == 0) {
         return 0;    
      }
      else {
         return totalSurfaceArea() / numberOfCones;
      }
   }
      
 /**
  *@return averages volume
  */    
   public double averageVolume() {
      if (numberOfCones == 0) {
         return 0;    
      }
      else {
         return totalVolume() / numberOfCones;
      }
   }

 /**
  *@return output formats cones for printing 
  */    
   public String toString() {
      String output = listName + "\n";
      int index = 0;
      while (index < numberOfCones) {
         output += "\n" + alphaList[index] + "\n"; 
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
   public IceCreamCone[] getList() {
   
      return alphaList;
   }
   
   /**
   *@return gives an IceCreamConeList object created from file
   *@param fileNameIn is the file's name
   *@throws FileNotFoundException ignores missing file
   */
   public IceCreamConeList2 readFile(String fileNameIn) 
                                    throws FileNotFoundException {
      
      Scanner reader = new Scanner(new File(fileNameIn));         
      
      IceCreamCone[] betaList = new IceCreamCone[100];
      String betaListName = "";
      int numConesBeta = 0;
   
      
      
      betaListName = reader.nextLine();
      while (reader.hasNext()) {
         String label = reader.nextLine();
         double radius = Double.parseDouble(reader.nextLine());
         double height = Double.parseDouble(reader.nextLine());
         
         IceCreamCone ice = new IceCreamCone(label, radius, height);
         betaList[numConesBeta] = ice;
         numConesBeta++;
      }
      
   
      IceCreamConeList2 strawberry 
               = new IceCreamConeList2(betaListName, betaList, numConesBeta);
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
      alphaList[numberOfCones] = peach;
      numberOfCones++;
   }
   /**
   *@param labelIn is the name of the cone
   *@return result for finding cone
   */
   public IceCreamCone findIceCreamCone(String labelIn) {
      //for each loop NOT allowed
      IceCreamCone result = null;
      for (int i = 0; i < numberOfCones; i++) {
      
         //if (cones.getLabel().get(i).equalsIgnoreCase(labelIn)) {
         if (alphaList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = alphaList[i];
         }
         /**
         for (int k = i; k < numberOfCones - 1; k++) {
            alphaList[k] = alphaList[k + 1];
         }
         
         alphaList[numberOfCones - 1] = null;
         result = true;
            
         break;
         }
         **/
         
      }
      return result;
   }
   /**
   *@param labelIn is the name of the cone
   *@return for finding cone
   */
   public IceCreamCone deleteIceCreamCone(String labelIn) {
      IceCreamCone result = null;
      for (int i = 0; i < numberOfCones; i++) {
      
         //if (cones.getLabel().get(i).equalsIgnoreCase(labelIn)) {
         if (alphaList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = alphaList[i];
         
            for (int k = i; k < numberOfCones - 1; k++) {
               alphaList[k] = alphaList[k + 1];
            }
         
            alphaList[numberOfCones - 1] = null;
            numberOfCones--;
            
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
   /**
      Your job is to return an IceCreamCone with particular attributes
      but the example only shows how to return a double.
      
      Plan A: Copy and paste example but change the variable 
      declared as a double to IceCreamCone.
         ^Plan failed. Error log says incompatible type for each
         
      Plan B: Change all declared attribute variables (shortest, longest etc)
      back to type double, but return the object at that index
      How to return object at index?
        see previous find and delete method
               Code snapshot 
                     IceCreamCone shortest = null;
                     if (numberOfCones <= 0) {
                        return 0;
                     }
                     
                     double shortCheck = alphaList[0].getRadius();
                     int index = 0;
                     while (index < numberOfCones) {
                        if (!(shortCheck < alphaList[index].getRadius())) {
                           shortest = alphaList[index].getRadius();
                        }
                        index++;
                     }
                     
                     return shortest;
         ^Plan failed. Incompatible type, says error log
         
       Plan C: I noticed I tried to return a zero instead of an IceCreamCone.
       How about deleting the first if statement? "If the number of cones is
       zero, return 0" is covered by initializing the IceCreamCone to null. 
         ^ Plan failed. We go from 8 errors to 4 though. Error log says
           I can't assign the radius at the specified index of the array to
           the IceCreamCone. Makes sense...
           
       Plan D: Try IceCreamCone = array[index] WITHOUT tacking on method call.
                  double shortCheck = alphaList[0].getRadius();
                  int index = 0;
                  
                  while (index < numberOfCones) {
                     if (!(shortCheck < alphaList[index].getRadius())) {
                       shortest = alphaList[index];
                     }
                     index++;
                  }
                  
                  return shortest;
                  
             ^Error count goes from 4 to 3 after changing the first method. 
             ^Code compiles. We await interactions. 
             ^Code works
         
                        
   */
   
   /**
      @return shortest is that IceCreamCone
   */
   public IceCreamCone findIceCreamConeWithShortestRadius() {
      //this method mod takes Error log from 4 to 3. Victory!
      IceCreamCone shortest = null;
      int indexOfShortest = 0;
      int index = 0;
      
      while (index < numberOfCones) {
         if (!(alphaList[indexOfShortest].getRadius()
               < alphaList[index].getRadius())) {
            indexOfShortest = index;
            shortest = alphaList[indexOfShortest];      
         }
         index++;
      }
      
      return shortest;
      
      
      /*
      //this line causes NPE
      double shortCheck = alphaList[0].getRadius();
      
      int index = 0;
      
      while (index < numberOfCones) {
         if (!(shortCheck < alphaList[index].getRadius())) {
           //notice that the equivalent line
           //in the triangle example passes list[index] to 
           //its equivalent of shortCheck, not the icecreamcone
           
          // shortest = alphaList[index] <--- Failed 
           
           shortCheck = alphaList[index].getRadius;
         }
         index++;
      }
   
      return shortest;
      
      */
      
   }
   /**
      @return longest is that IceCreamCone
   */   
   public IceCreamCone findIceCreamConeWithLongestRadius() {
      IceCreamCone longest = null;
      int indexOfLongest = 0;
      int index = 0;
      
      while (index < numberOfCones) {
         if (alphaList[indexOfLongest].getRadius()
               < alphaList[index].getRadius()) {
            indexOfLongest = index;
            longest = alphaList[indexOfLongest];
                 
         }
         index++;
      }
      return longest;
      /*
      double longCheck = alphaList[0].getRadius();
      int index = 0;
      int indexOfLongest = 0;
      while (index < numberOfCones) {
         if (!(longCheck > alphaList[index].getRadius())) {
           longest = alphaList[index];
         }
         index++;
      }
      
      return longest;
      **/
      
   }
   /**
      @return smallest is that IceCreamCone
   */   
   public IceCreamCone findIceCreamConeWithSmallestVolume() {
      IceCreamCone smallest = null;
      
      int indexOfSmallest = 0;
      int index = 0;
      
      while (index < numberOfCones) {
         if (!(alphaList[indexOfSmallest].volume()
              < alphaList[index].volume())) {
            indexOfSmallest = index;
            smallest = alphaList[indexOfSmallest];     
         }
         index++;
      }
      
      return smallest;
      /**
      double smallCheck = alphaList[0].volume();
      int index = 0;
      int indexOfSmallest = 0;
      while (index < numberOfCones) {
         if (!(smallCheck < alphaList[index].volume())) {
           smallest = alphaList[index];
         }
         index++;
      }
      
      return smallest;
      */
   }
   /**
    @return biggest has the largest volume
   */
   public IceCreamCone findIceCreamConeWithLargestVolume() {
      IceCreamCone biggest = null;
      
      int indexOfBiggest = 0;
      int index = 0;
      
      while (index < numberOfCones) {
         if ((alphaList[indexOfBiggest].volume()
              < alphaList[index].volume())) {
            indexOfBiggest = index;
            biggest = alphaList[indexOfBiggest];     
         }
         index++;
      }
      
      return biggest;
  
      /**
      double bigCheck = alphaList[0].volume();
      int index = 0;
      int indexOfLargest = 0;
      while (index < numberOfCones) {
         if (!(bigCheck > alphaList[index].volume())) {
           largest = alphaList[index];
         }
         index++;
      }
      
      return largest;
      */
   }
      
      
}
