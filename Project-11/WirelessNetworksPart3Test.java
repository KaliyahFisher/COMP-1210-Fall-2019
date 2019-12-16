import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
//import java.io.File;

/**
 *This tests the WirelessNetworksPart3 driver.
 *@author Kaffeein Bellamy
 *@version 11/29/2019
 */
public class WirelessNetworksPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
/**
 * Tests run.
 *@throws FileNotFoundException for missing file
 */   
   @Test public void run() {
      WirelessNetworksPart3 w3 = new WirelessNetworksPart3();
      WiFi w = new WiFi("Wifi", 1.0, 2.0, 3.0);
      Assert.assertEquals(0, w.hashCode());
      Assert.assertTrue(w.equals(w)); 
      String str = "";
      InvalidCategoryException i = new InvalidCategoryException(str);
      
      Assert.assertFalse(w.equals(str));      
      
   }   
   

/**
 * Tests the main method for empty.
 *@throws FileNotFoundException for missing file
 */

   @Test public void mainMethodTest() {
      WirelessNetworkList wL = new WirelessNetworkList();
      String[] args1 = {};
     
      WirelessNetworksPart3.main(args1);
      Assert.assertTrue(Cellular.COST_FACTOR == 1.0); 


   }

/**
 * Tests the main method with argument.
 *@throws FileNotFoundException for missing file
 */
    
    
   @Test public void mainMethodBTest() {
      WirelessNetworkList wL = new WirelessNetworkList();
      String[] args1 = {"wireless_network_data2.exceptions.csv"};
       
      
      WirelessNetworksPart3.main(args1);
      Assert.assertTrue(Cellular.COST_FACTOR == 1.0); 
   }
   
/**
 * Tests the main method with invalid argument.
 *@throws FileNotFoundException for missing file
 */   
   
   @Test public void invalidFileTest() {
      WirelessNetworkList wL = new WirelessNetworkList();
      String[] args1 = {"noFile.csv"};
      
   
   }
/**
 * Tests compareTo method.
 */ 
   
   @Test public void compareTest() {
      WiFi w = new WiFi("Wifi", 1.0, 2.0, 3.0);
      WiFi x = new WiFi("Wifi", 1.0, 2.0, 3.0);
      //int y = w.compareTo(x);
      Assert.assertEquals(0, w.compareTo(x));
     
   }
   

   
   
}
