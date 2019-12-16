/**
 * This is class inherits WirelessNetwork.
 *@author Kaffeein Bellamy
 *@version 11/5/2019
 */
public class Cellular extends WirelessNetwork {
   protected double time;
   protected double dataLimit;
   /** This constant is the cost factor. */
   public static final double COST_FACTOR = 1.0;
   /**
    *@param nameIn feeds name
    *@param bandwidthIn feeds bandwidth
    *@param costIn feeds cost
    *@param timeIn feeds time
    *@param limitIn feeds limit
    */
   public Cellular(String nameIn, double bandwidthIn, double costIn, 
                   double timeIn, double limitIn) {
      super(nameIn, bandwidthIn, costIn);
      time = timeIn;
      dataLimit = limitIn;
   }
   /**
    *@return time give back time
    */   
   public double getTime() {
      return time;
   }
   /**
    *@param timeIn feeds time
    */   
   public void setTime(double timeIn) {
      time = timeIn;
   }
   /**
    *@return dataLimit gives dataLimit
    */   
   public double getDataLimit() {
      return dataLimit;
   }
   /**
    *@param limitIn feeds dataLimit
    */   
   public void setDataLimit(double limitIn) {
      dataLimit = limitIn;
   }
   /**
    *@return calculates data usage
    */   
   public double dataUsage() {
      return super.getBandwidth() / 8000 * getTime();
   }
   /**
    *@return gives back monthly cost
    */   
   public double monthlyCost() {
      return dataUsage() <= getDataLimit() 
             ? super.getMonthlyFixedCost() 
             : (super.getMonthlyFixedCost() 
             + (dataUsage() - getDataLimit()) * Cellular.COST_FACTOR); 
   }
   /**
    *@return formats data as readable string
    */   
   public String toString() {
      return super.toString()
             + "\nTime: " + getTime() + " seconds"
             + "\nData Limit: " + getDataLimit() + " GB"
             + "\nData Used: " + dataUsage() + " GB";
             
   }
}