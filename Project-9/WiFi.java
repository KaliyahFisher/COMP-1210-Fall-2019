/**
 * The Wifi class inherits WirelessNetwork.
 *@author Kaffeein Bellamy
 *@version 11/5/2019
 */
public class WiFi extends  WirelessNetwork {
   private double modemCost;
   /**
    *@param nameIn feeds name
    *@param bandwidthIn in feeds bandwith
    *@param costIn feeds cost
    *@param modemCostIn feeds modemCost
    */   
   public WiFi(String nameIn, double bandwidthIn, 
                double costIn, double modemCostIn) {
      super(nameIn, bandwidthIn, costIn);
      modemCost = modemCostIn;
   }
   /**
    *@return modemCost gives back cost
    */   
   public double getModemCost() {
      return modemCost;
   }
   /**
    *@param modemCostIn feeds  cost
    */     
   public void setModemCost(double modemCostIn) {
      modemCost = modemCostIn;
   }
   
   /**
    *@return gives back monthly cost
    */
   public double monthlyCost() {
      return super.getMonthlyFixedCost() + getModemCost();
   }
}