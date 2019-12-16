/**
 * This feeds the InventoryListApp.
 *@author Kaffeein Bellamy
 *@version 11/10/2019
 */
public class InventoryListApp {
/**
 * This is the main method.
 *@param args Commandline args not used.
 */   
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      ItemsList myItems = new ItemsList();
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      System.out.print("Total: " + myItems.calculateTotal(2.0));
   }
}