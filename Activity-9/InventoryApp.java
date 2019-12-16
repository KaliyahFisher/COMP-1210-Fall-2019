/**
 * This is the driver app for the other java documents.
 *@author Kaffeein Bellamy
 *@version 11/4/2019
 */
public class InventoryApp {
/**
 * Main method follows.
 *@param args Command line args (not used)
 */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone",
                                  80.00, 1.8); //fine
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      //remember to use the dot method on the object name and not the class
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      System.out.print(item1 + "\n" + item2 + "\n" + item3 + "\n" + item4);
      
   }
}