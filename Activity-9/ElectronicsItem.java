/**
 * This is the driver app for the other java documents.
 *@author Kaffeein Bellamy
 *@version 11/4/2019
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   /**
      No main method.
   */
   public static final double SHIPPING_COST = 1.5;
   /**
    @param nameIn feeds name
    @param priceIn feeds price
    @param weightIn feeds weight
    */     
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
    @return gives back cost by weight
    */     
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}