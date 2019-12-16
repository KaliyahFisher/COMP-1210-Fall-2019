/**
 * This java inherits InventoryItem.
 *@author Kaffeein Bellamy
 *@version 11/4/2019
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount = 0;
   /**
    @param nameIn feeds name
    @param priceIn feeds price
    */   
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   /**
    @param wordCountIn feeds wordCount
    */   
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}