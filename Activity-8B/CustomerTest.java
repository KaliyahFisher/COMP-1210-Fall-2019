import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

   /**
    * This method tests the Customer.java code.
    */
public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * This method tests the setLocation method.
    */
   @Test public void setLoationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Bostom, MA");
      Assert.assertEquals("Bostom, MA", cstmr.getLocation());
      
   }
   /**
    * This method tests the setLocation method.
    */
   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
      
   }
   /**
    * This method tests the changeBalance method.
    */
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }
   /**
    * This method tests the toString method.
    */
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
      
   }
   /**
    * This method tests the compareTo interface.
    */   
   @Test public void compareToTest1() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   /**
    * This method tests the compareTo interface.
    */      
   @Test public void comapreToTest2() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
      
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
   /**
    * This method tests the compareTo interface.
    */      
   @Test public void comapreToTest3() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
      
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}
