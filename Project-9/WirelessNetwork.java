import java.text.DecimalFormat;
/**
 * This is an abstract class.
 *@author Kaffeein Bellamy
 *@version 11/5/2019
 */
public abstract class WirelessNetwork {
   protected String name = "";
   protected double bandwidth;
   protected double monthlyCost;
   protected static int count = 0;
   /**
    *@param nameIn feeds name
    *@param bandwidthIn in feeds bandwith
    *@param costIn feeds cost
    */  
   public WirelessNetwork(String nameIn, double bandwidthIn, double costIn) {
      name = nameIn;
      bandwidth = bandwidthIn;
      monthlyCost = costIn;
      count++;
   }
   /**
    *@return name gives back name
    */
   public String getName() {
      return name;
   }
   /**
    *@param nameIn feeds name
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   /**
    *@return bandwidth gives back bandwidth
    */   
   public double getBandwidth() {
    //at first I had Mbps concated as a string, but 
      // I realized it would be better if I put that
      //in the toString method if I wanted to use this method 
      // to calculate something later
      return bandwidth;
   }
   /**
    *@param bandwidthIn feeds bandwidth
    */   
   public void setBandwidth(double bandwidthIn) {

      bandwidth = bandwidthIn;
   }
   /**
    *@param costIn feeds costs
    */    
   public void setMonthlyFixedCost(double costIn) {
      monthlyCost = costIn;   
   }
   /**
    *@return monthlyCost gives back monthly cost
    */   
   public double getMonthlyFixedCost() {
      return monthlyCost;
   }
   /**
    *@return count gives back number of objects
    */   
   public static int getCount() {
      return count;
   }
   /**
    * This method makes the counter zero.
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    *@return formats data as string
    */   
   public String toString() {
      //accidentally concated "My" in front
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      return name + " (" + this.getClass() + ") " 
             + "Cost: " + df.format(monthlyCost())
             + "\nBandwidth: " + getBandwidth() + " Mbps";
   }
   
   /**
    * This is an abstract method.
    *@return abstract
    */
   public abstract double monthlyCost();
}