import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This tests the WiFi.java. */

public class WiFiTest {


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
      WiFi open = new WiFi("open", 500.0, 20.00, 10.00);
      Assert.assertEquals("open", open.getName());
      
      open.resetCount();
      WiFi open2 = new WiFi("open2", 500.0, 20.00, 10.00);

      Assert.assertEquals(500.0, open2.getBandwidth(), 0.00001);
      Assert.assertEquals(1, open2.getCount());
      Assert.assertEquals(20.00, open2.getMonthlyFixedCost(), 0.0001);
   }
   /** This method tests setters. */   
   
   @Test public void settersAlpha() {
      //setName
      //setBandwidth
      WiFi open = new WiFi("", 0, 20.00, 10.00);
      open.setName("open");
      open.setBandwidth(500.0);

      //line below might raise commandline flag
      Assert.assertEquals("open", open.getName());
      Assert.assertEquals(500.0, open.getBandwidth(), 0.00001);

   }
   /** This method tests the reset method. */   
   
   @Test public void reset() {
      WiFi open = new WiFi("open", 500.0, 20.00, 10.00);
      open.resetCount();
      Assert.assertEquals(0, open.getCount());
   }
   
   




   //REMEMBER, each @Test is followed by
   // public void
   /** This method tests the get cost method. */   
   
   @Test public void getModemCostTest() {
      WiFi open = new WiFi("open", 500.0, 20.00, 10.00);
      Assert.assertEquals(10.00, open.getModemCost(), 0.00001);
      WiFi closed = new WiFi(null, 0, 0, 0);
      Assert.assertEquals(0, closed.getModemCost(), 0.00001);
   }
   /** This method tests the setCost method. */   
   
   @Test public void  setModemCostTest() {
      WiFi open = new WiFi("open", 500.0, 20.00, 10.00);
      open.setModemCost(30.00);
      Assert.assertEquals(30.00, open.getModemCost(), 0.00001);
   }
   /** This method tests the monthly cost method. */   
   
   @Test public void monthlyCostTest() {
      WiFi open = new WiFi("open", 500.0, 20.00, 10.00);
      Assert.assertEquals(30.00, open.monthlyCost(), 0.00001);
   }
   /** This method tests the set monthly cost method. */   
   @Test public void setMonthlyFixedCostTest() {
      WiFi open = new WiFi("open", 500.0, 20.00, 10.00);
      open.setMonthlyFixedCost(30.00);
      Assert.assertEquals(30.00, open.getMonthlyFixedCost(), 0.01);
   }
}
