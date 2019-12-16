import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This tests the FiveG.java. */
public class FiveGTest {


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
      FiveG  phone = new FiveG("Phone", 80.0, 
                              80.00, 1200.0, 10.0);
      Assert.assertEquals("Phone", phone.getName());
      
      phone.resetCount();
      FiveG  phone2 = new FiveG("Phone", 80.0, 
                                80.00, 1200.0, 10.0);

      Assert.assertEquals(80.0, phone2.getBandwidth(),
                           0.00001);
      Assert.assertEquals(1, phone2.getCount());
      Assert.assertEquals(80.00, phone2.getMonthlyFixedCost(),
                            0.0001);
   }
   /** This method tests setters. */   
   
   @Test public void settersAlpha() {
      //setName
      //setBandwidth
      FiveG  phone = new FiveG("", 0, 80.00, 1200.0, 10.0);
      phone.setName("Phone");
      phone.setBandwidth(80.0);
      //String str1 = "Phone";
      //line below might raise commandline flag
      Assert.assertEquals("Phone", phone.getName());
      Assert.assertEquals(80.0, phone.getBandwidth(), 0.00001);

   }
   /** This method tests the reset method. */   
   
   @Test public void reset() {
      FiveG  phone = new FiveG("Phone", 80.0, 
                           80.00, 1200.0, 10.0);
      phone.resetCount();
      Assert.assertEquals(0, phone.getCount());
   }
   
   
   
   /** This method tests the getTime method. */   
   
   @Test public void setters() {
      FiveG  phone = new FiveG("Phone", 80.0,
                                 80.00, 0, 0);
      phone.setTime(300.0);
      phone.setDataLimit(5.0);
      
      Assert.assertEquals(300.0, phone.getTime(), 0.0001);
      Assert.assertEquals(5.0, phone.getDataLimit(), 0.0001);
   }
   /** This method tests the set time method. */   
   
   @Test public void getters() {
      FiveG  phone = new FiveG("Phone", 80.0, 80.00, 
                                 1200.0, 10.0);
      phone.getDataLimit();
      phone.getTime();
      
      Assert.assertEquals(10.0, phone.getDataLimit(), 0.0001);
      Assert.assertEquals(1200.0, phone.getTime(), 0.0001);
   }
   /** This method tests the dataUsage method. */   
   
   @Test public void dataUsageTest() {
      FiveG  phone = new FiveG("Phone", 80.0, 
                                 80.00, 1200.0, 10.0);
      
      Assert.assertEquals(12.0, phone.dataUsage(), 0.00001);
   
   }
   /** This method tests the monthlyCost method. */   
   
   @Test public void monthlyCostTest() {
      FiveG  phone = new FiveG("Phone", 80.0,
                               80.00, 1200.0, 10.0);
      
      Assert.assertEquals(110.0, phone.monthlyCost(), 0.0001);
      
      FiveG  phone2 = new FiveG("Phone", 100.0, 
                                    20.00, 20.0, 10.0);
      Assert.assertEquals(20.00, phone2.monthlyCost(), 0.0001);
   }
   /** This method tests the toString. */   
   
   @Test public void toStringTest() {
      FiveG  phone = new FiveG("Phone", 80.0, 
                                 80.00, 1200.0, 10.0);
      Assert.assertTrue(phone.toString().contains("Cost:"));
      Assert.assertFalse(phone.toString().contains("apple"));
   }
   
   /** This method tests the set monthly cost method. */   
   @Test public void setMonthlyFixedCostTest() {
      FiveG  phone = new FiveG("Phone", 80.0, 
                                 80.00, 1200.0, 10.0);
      phone.setMonthlyFixedCost(30.00);
      Assert.assertEquals(30.00, phone.getMonthlyFixedCost(), 0.01);
   }   
}
