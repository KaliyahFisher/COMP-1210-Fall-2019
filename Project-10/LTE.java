/**
 * This class inherits LTE.
 *@author Kaffeein Bellamy
 *@version 11/5/2019
 */
public class LTE extends Cellular {
   /** This constant is the cost factor. */
   public static final double COST_FACTOR = 4.0;
   /**
    *@param nameIn feeds name
    *@param bandwidthIn feeds bandwidth
    *@param costIn feeds cost
    *@param timeIn feeds time
    *@param limitIn feeds limit
    */   
   public LTE(String nameIn, double bandwidthIn, 
              double costIn, double timeIn, double limitIn) {
      //this super call references two hierarchies of
      //inheritance
      super(nameIn, bandwidthIn, costIn, timeIn, limitIn);
                 
   }
   
   /**
    *@return gives back monthly cost
    */   
   public double monthlyCost() {
      return dataUsage() <= getDataLimit() 
             ? super.getMonthlyFixedCost() 
             : (super.getMonthlyFixedCost() 
             + (dataUsage() - getDataLimit()) * LTE.COST_FACTOR * 2); 
   }   
   
}