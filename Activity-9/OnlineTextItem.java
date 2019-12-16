/**
 * This is the OnlineTextItem java.
 *@author Kaffeein Bellamy
 *@version 11/4/2019
 */
public abstract class OnlineTextItem extends InventoryItem {
   /**
    @param nameIn feeds name
    @param priceIn feeds price
    */   
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   /**
    @return price prints price
    */   
   public double calculateCost() {
      return price;
   }
}