/**
 * This is the feeder for InventoryApp.
 *@author Kaffeein Bellamy
 *@version 11/4/2019
 */
public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0;
   /**
    @param nameIn feeds name
    @param priceIn feeds price
    */   
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   /**
    @return name gives back name
    */   
   public String getName() {
      return name;
   }
   /**
    @return gives back price with tax
    */   
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
    @param taxRateIn feeds taxRate
    */   
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   /**
    @return gives back name and price
    */   
   public String toString() {
      return name + ": $" + calculateCost();
   }
}