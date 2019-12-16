/**
 * This feeds the InventoryListApp.
 *@author Kaffeein Bellamy
 *@version 11/10/2019
 */
 
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   /**
    The constructor accepts no parameters.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /**
    *@param itemIn adds to the array.
    */   
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
    *@param electronicsSurcharge adds surcharge
    *@return total gives back total
    */    
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
            
         }
         
         else {
            total += inventory[i].calculateCost();
         }
      }  
      return total; 
   }
   /**
    *@return output formats string
    */     
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
         
      }
      
      return output;
   }
   
   
}