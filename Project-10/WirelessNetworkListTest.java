import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//import java.util.Arrays;

/**
 * This is the test for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */
public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Test public void invalidRecTest() {
      WirelessNetworkList w = new WirelessNetworkList();
      String[] s = new String[0];
      
      //assert that the string equals the return
      // given back by the invalid records array
      //called on the list object
      
      
      //to fix "deprecated API error" use Assert.assertArrayEquals
      // instead of assert equals
      Assert.assertArrayEquals(s, w.getInvalidRecordsArray());
   }
   
   /** Fixture initialization (common initialization
    *  for all tests). **/   
   @Test public void addInvalidTest() {
      WirelessNetworkList w = new WirelessNetworkList();
      String[] s = new String[1];
      w.addInvalidRecord(null);
      Assert.assertArrayEquals(s, w.getInvalidRecordsArray());
   }
   
   

}
