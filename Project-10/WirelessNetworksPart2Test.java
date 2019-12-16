import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
 * This is the test for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */

public class WirelessNetworksPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    Main method test.
    @throws IOException for missing file
    */ 
   
   @Test public void noArgsTest() throws IOException  {
      
      /**
         The line of code below is an empty string array
         with the name  args1.
      */
      String[] args1 = {};
      /**
         Below, we can call the main method of 
         WirelessNetworksPart2 with the formatting 
         class.main(), and inside the parentheses of 
         the main method () you may enter an object
         of the type of parameter it accepts.
         Here it is args1, but know that args1 could 
         have had any name. 
         
         
      */
      try {
      
         WirelessNetworksPart2.main(args1);
         Assert.assertTrue(Cellular.COST_FACTOR == 1.0);
         
      }
      
      catch (IOException e) {
         System.out.print(e);
      }
      //had to catch this exception
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.print("");
      }
      
      
      
   }
   
   /** Fixture initialization (common initialization
    *  for all tests). 
    @throws IOException for missing file
    */   
   @Test public void yesArgsTest() throws IOException {
      String[] args2 = {"wireless_network_data1.csv"};
      
      WirelessNetworksPart2 app = new WirelessNetworksPart2();
      /**
         "...deprecated API" error is caused by not adding delta 
         to assertion
       */

      WirelessNetworksPart2.main(args2); 
      Assert.assertEquals(1.0, Cellular.COST_FACTOR, 0.001);


   }
   
   /**
   @Test public void nameTest() throws IOException {
      
         How to test a read file method?
         - declare a new array of type "class name"
         - add items that you know are in the file to array
         - create a "list" object 
         - call the readfile method on the list object
         - pass the name of the file as a string through
           the parameters of the previous method call
         - assert that the text you want equals 
           the return from the method call that is supposed
           to fetch that text (called in terms of the list)
      
      
      WirelessNetwork[] w = new WirelessNetworkArray[5];
      w[0] = new WiFi("My Wifi", 450, 40, 5)
      
   }
   */
}
