import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This is the test for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */
public class BandwidthComparatorTest {
/**
 * This is the test for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */
 

   private final BandwidthComparator b = new BandwidthComparator();
   /** Fixture initialization (common initialization
    *  for all tests). **/ 

   @Before public void setUp() {
   }
   

   /** Fixture initialization (common initialization
    *  for all tests). **/   
   @Test public void bandTest() {
      Cellular c1 = new Cellular("Samsung", 10.0, 20.0, 30.0, 40.0);
      Cellular c2 = new Cellular("Droid", 20, 60, 80, 100);
      Cellular c3 = new Cellular("iPhone", 1.0, 2.0, 3.0, 4.0);
      Cellular c4 = new Cellular("Samsung", 10.0, 20.0, 30.0, 40.0);
      
      int r1 = b.compare(c1, c2);
      int r2 = b.compare(c1, c3);
      int r3 = b.compare(c1, c4);
      Assert.assertEquals(-1, r1);
      Assert.assertEquals(0, r3);
      Assert.assertEquals(1, r2);
      
   }
}
