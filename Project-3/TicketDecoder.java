
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * This program reads and interprets football ticket data.
 *@author Kaffeein Bellamy
 *@version 13/9/2019
 */
public class TicketDecoder {
/**
 * Program reads ticket data.
 *@param args Command line arguments (not used).
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String ticketData = "";
      System.out.print("Enter your ticket code: ");
      ticketData = userInput.nextLine().trim();
   
      if (ticketData.length() < 26) {
         
         System.out.println("\nInvalid Ticket Code." 
            + "\nTicket code must have at least 26 characters.");
      }         
      else { 
      //Strings broken and interpreted

         String game = ticketData.substring(25, ticketData.lastIndexOf(""));
         String time = ticketData.substring(6, 11);
         String section = ticketData.substring(19, 21);
         String row = ticketData.substring(21, 23);
         String seat = ticketData.substring(23, 25);
         double price = Double.parseDouble(ticketData.substring(0, 5));
         price /= 100;
         double discount = Double.parseDouble(ticketData.substring(5, 7));
         double cost = price - (price * ((discount) / 100));
      
         //DecimalFormats listed
         DecimalFormat csh = new DecimalFormat("$#,###.00");
         DecimalFormat dis = new DecimalFormat("0%");
         DecimalFormat prz = new DecimalFormat("0000000");
      
         //Generates lottery prize number
         Random random = new Random();
         int prize = random.nextInt(9999999 - 1) + 1;
   

         if (ticketData.length() >= 26) {
            System.out.print("\nGame: " + game + "   Date: "
               + ticketData.substring(11, 13)
               + "/" + ticketData.substring(13, 15) + "/" 
               + ticketData.substring(15, 19));
        
            System.out.print("   Time: " + time.substring(1, 3) 
               + ":" + time.substring(3, 5)); //runs
            System.out.print("\nSection: " + section + "   Row: " 
               + row + "   Seat: " + seat);   
            System.out.print("\nPrice: " + csh.format(price) 
               + "   Discount: " + (int) discount + "%");    
            System.out.print("   Cost: " + csh.format(cost) 
               + "\nPrize Number: " + prz.format(prize));
         }   

      }
   }
}         

      
           
            
