/**
 * This is the OnlineBook java.
 *@author Kaffeein Bellamy
 *@version 11/4/2019
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   /**
    @param nameIn feeds name
    @param priceIn feeds price
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
    @param authorIn feeds author
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   /**
    @return prints name formated
    */
   public String toString() {
   /**
     I over thought this line. When the worksheet said 
     override the toString to return the author name
     after the book name, I thought I had to use a 
     dot method to split up the toString from the
     parent class. It turns out that I only had
     to concat the name and author variables and 
     use super for the cost from the parent class.
   */
      return name + " - " + author + ": $" + super.calculateCost(); 
   }
}