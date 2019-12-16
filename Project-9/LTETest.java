import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This tests the LTE.java. */

public class LTETest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** This method tests getters. */
   
   @Test public void gettersAlpha() {
      //getName
      //getBandwidth
      //getCount
      //getMonthlyCost   
      LTE iPad = new LTE("iPad", 400.0, 20.00, 0, 0);
      Assert.assertEquals("iPad", iPad.getName());
      
      iPad.resetCount();
      LTE iPad2 = new LTE("iPad", 400.0, 20.00, 0, 0);

      Assert.assertEquals(400.0, iPad.getBandwidth(), 0.00001);
      Assert.assertEquals(1, iPad2.getCount());
      Assert.assertEquals(20.00, iPad2.getMonthlyFixedCost(), 0.0001);
   }
   /** This method tests setters. */   
   
   @Test public void settersAlpha() {
      //setName
      //setBandwidth
      LTE iPad = new LTE(null, 0.0, 20.00, 0, 0);
      iPad.setName("iPad");
      iPad.setBandwidth(400.0);
      //String str1 = "iPad";
      //line below might raise commandline flag
      Assert.assertEquals("iPad", iPad.getName());
      Assert.assertEquals(400.0, iPad.getBandwidth(), 0.00001);

   }
   /** This method tests the reset method. */   
   
   @Test public void reset() {
      LTE iPad2 = new LTE("iPad", 400.0, 20.00, 0, 0);
      iPad2.resetCount();
      Assert.assertEquals(0, iPad2.getCount());
   }
   
   
   /** This method tests setters. */   
   @Test public void setters() {
      LTE iPad = new LTE("iPad", 400.0, 20.00, 0, 0);
      iPad.setTime(300.0);
      iPad.setDataLimit(5.0);
      
      Assert.assertEquals(300.0, iPad.getTime(), 0.0001);
      Assert.assertEquals(5.0, iPad.getDataLimit(), 0.0001);
   }
   
   /** This method tests getters. */
   
   @Test public void getters() {
      LTE iPad = new LTE("iPad", 20.0, 38.00, 1200.0, 2.0);
      iPad.getDataLimit();
      iPad.getTime();
      
      Assert.assertEquals(2.0, iPad.getDataLimit(), 0.0001);
      Assert.assertEquals(1200.0, iPad.getTime(), 0.0001);
   }
   /** This method tests the dataUsage method. */   
   
   @Test public void dataUsageTest() {
      LTE iPad = new LTE("iPad", 20.0, 38.00, 1200.0, 2.0);
      
      Assert.assertEquals(3.0, iPad.dataUsage(), 0.00001);
   
   }
   /** This method tests the monthlyCost method. */   
   
   @Test public void monthlyCostTest() {
      LTE iPad1 = new LTE("iPad", 10.0, 38.00, 1200.0, 2.0);
      
      Assert.assertEquals(38.00, iPad1.monthlyCost(), 0.0001);
      
      LTE iPad2 = new LTE("iPad", 400.0, 38.00, 1000.0, 2.0);
      Assert.assertEquals(422.00, iPad2.monthlyCost(), 0.0001);
   }
   /** This method tests the toString. */   
   
   @Test public void toStringTest() {
      LTE iPad1 = new LTE("iPad", 10.0, 38.00, 1200.0, 2.0);
      Assert.assertTrue(iPad1.toString().contains("Cost:"));
      Assert.assertFalse(iPad1.toString().contains("phone"));
   }
   /** This method tests the set monthly cost method. */   
   @Test public void setMonthlyFixedCostTest() {
      LTE iPad1 = new LTE("iPad", 10.0, 38.00, 1200.0, 2.0);
      iPad1.setMonthlyFixedCost(30.00);
      Assert.assertEquals(30.00, iPad1.getMonthlyFixedCost(), 0.01);
   }
}
