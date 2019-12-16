import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This tests the Cellular.java. */
public class CellularTest {


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
      Cellular talk = new Cellular("talk", 5.0, 20.00, 1200.0, 1.0);
      Assert.assertEquals("talk", talk.getName());
      
      talk.resetCount();
      Cellular talk2 = new Cellular("talk2", 5.0, 20.00, 1200.0, 1.0);

      Assert.assertEquals(5.0, talk2.getBandwidth(), 0.00001);
      Assert.assertEquals(1, talk2.getCount());
      Assert.assertEquals(20.00, talk2.getMonthlyFixedCost(), 0.0001);
   }
   /** This method tests setters. */   
   @Test public void settersAlpha() {
      //setName
      //setBandwidth
      Cellular talk = new Cellular(null, 0.0, 20.00, 0, 0);
      talk.setName("talk");
      talk.setBandwidth(400.0);
      //String str1 = "talk";
      //line below might raise commandline flag
      Assert.assertEquals("talk", talk.getName());
      Assert.assertEquals(400.0, talk.getBandwidth(), 0.00001);

   }
   /** This method tests the reset method. */   
   @Test public void reset() {
      Cellular talk = new Cellular("talk", 0.0, 20.00, 0, 0);
      talk.resetCount();
      Assert.assertEquals(0, talk.getCount());
   }



   //You can do setters and getters together, but I split them
   
   /** This method tests the getTime method. */   
   @Test public void getTimeTest() {
      Cellular talk = new Cellular("talk", 5.0, 20.00, 
                                1200.0, 1.0);
      Assert.assertEquals(1200.0, talk.getTime(), 0.00001);
      
      Cellular quiet = new Cellular(null, 0, 0, 
                                0, 0);

      Assert.assertEquals(0, quiet.getTime(), 0.00001);
   }
   /** This method tests the set time method. */   
   @Test public void setTimeTest() {
      Cellular talk = new Cellular("talk", 5.0, 20.00, 
                                1200.0, 1.0);
      talk.setTime(500.0);                         
      Cellular quiet = new Cellular(null, 0, 0, 
                                0, 0);
      quiet.setTime(2);                          
                                
      Assert.assertEquals(500.0, talk.getTime(), 0.00001);
      Assert.assertEquals(2.0, quiet.getTime(),
                         0.00001);                                    
   }
   /** This method tests the getDataLimit method. */   
   @Test public void getDataLimitTest() {
      Cellular talk = new Cellular("talk", 5.0, 20.00, 
                                1200.0, 1.0);
                        
      Cellular quiet = new Cellular(null, 0, 0, 
                                0, 0);
      Assert.assertEquals(1.0, talk.getDataLimit(), 0.00001);
      
      Assert.assertEquals(0, quiet.getDataLimit(),
                         0.00001);                                
   }
   /** This method tests the setDataLimit method. */   
   @Test public void setDataLimitTest() {
      Cellular talk = new Cellular("talk", 5.0, 20.00, 
                                1200.0, 1.0);
      talk.setDataLimit(3.0);                                                  
      Cellular quiet = new Cellular(null, 0, 0, 
                                0, 0);   
      quiet.setDataLimit(200.0);                          
      Assert.assertEquals(3.0, talk.getDataLimit(), 0.00001);
      Assert.assertEquals(200.0, quiet.getDataLimit(), 0.00001);
   }
   /** This method tests the dataUsage method. */   
   @Test public void dataUseTest() {
      Cellular talk = new Cellular("talk", 5.0, 20.00, 
                                    1200.0, 1.0);                       
      Cellular quiet = new Cellular(null, 0, 0, 0, 0); 
      
      Assert.assertEquals(0.75, talk.dataUsage(), 0.00001);
      Assert.assertEquals(0, quiet.dataUsage(),
                          0.00001);                                
   }
   /** This method tests the monthlyCost method. */   
   @Test public void monthlyCostTest() {
      //less than
      //equal to
      //greater than
      Cellular talk = new Cellular("talk", 5.0, 20.00, 
      /*less*/                              1200.0, 1.0);                       
      Assert.assertEquals(20.00, talk.monthlyCost, 0.01);
      
      Cellular talk2 = new Cellular("talk", 100.0, 20.00, 
      /*greater*/                          150.0, 1.0);                       
      Assert.assertEquals(20.88, talk2.monthlyCost(), 0.01);
      
      /*equal*/
      Cellular talk3 = new Cellular("talk", 8000.0, 20.00, 1.0, 1.0);
      Assert.assertEquals(20.00, talk3.monthlyCost(), 0.01);
      
      
   }
   /** This method tests the toString. */   
   @Test public void toStringTest() {
      Cellular talk = new Cellular("talk", 5.0, 
                                   20.00, 1200.0, 1.0);                       
      Assert.assertTrue(talk.toString().contains("Data Limit:"));
   }
   /** This method tests the set monthly cost method. */   
   @Test public void setMonthlyFixedCostTest() {
      Cellular talk3 = new Cellular("talk", 8000.0, 20.00, 1.0, 1.0);
      talk3.setMonthlyFixedCost(30.00);
      Assert.assertEquals(30.00, talk3.getMonthlyFixedCost(), 0.01);
   }

}
