/**
 * This class inherits Cellular.
 *@author Kaffeein Bellamy
 *@version 11/5/2019
 */
public class FiveG extends Cellular {
   /** This constant is the cost factor. */
   public static final double COST_FACTOR = 5.0;
   /**
    *@param nameIn feeds name
    *@param bandwidthIn feeds bandwidth
    *@param costIn feeds cost
    *@param timeIn feeds time
    *@param limitIn feeds limit
    */   
   public FiveG(String nameIn, double bandwidthIn, double costIn,
                  double timeIn, double limitIn) {
      super(nameIn, bandwidthIn, costIn, timeIn, limitIn);
      
      //super(timeIn, limitIn); don't do this. error log
      // requires super to be first statement. use once
   }
   /**
    *@return gives back monthly cost
    */     
   public double monthlyCost() {
      return dataUsage() <= getDataLimit() 
             ? super.getMonthlyFixedCost() 
             : (super.getMonthlyFixedCost() 
             + (dataUsage() - getDataLimit()) * FiveG.COST_FACTOR * 3); 
   }   
   
   
}