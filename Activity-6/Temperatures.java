import java.util.ArrayList;
/**
 * This program is the base of the TemperatureInfo driver.
 *@author Kaffeein Bellamy
 *@version 10/7/2019
 */
public class Temperatures {
   /**
    * This class holds the methods for temperature.
    */
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   /**
    *@param temperaturesIn is the temperature.
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
    /**
    *@return is the lowest temperature.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
         //the middle param is the number of objects in the array
         
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
    /**
    *@return is the highest temperature.
    */   
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);

      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;  
   }
    /**
    *@return is the lower min temperature.
    *@param lowIn is user input
    */   
   public int lowerMinimum(int lowIn) {
   //if the statement before ? is true, return lowIn
   //if the statement is false, return getLowTemp()
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
    /**
    *@return is the higher max temperature.
    *@param highIn is user input
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
    /**
    *@return prints out temperatures
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}