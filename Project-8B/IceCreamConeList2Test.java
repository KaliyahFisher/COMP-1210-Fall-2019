import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;


/**
This file tests all the methods in ICCL2.java.
*/
public class IceCreamConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**  
   This tests the getName method.
   */
   @Test public void getNameTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      Assert.assertEquals("Test", iList.getName());
   
   /** Attempt 1, Incorrect
      IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
      Assert.assertEquals("mainList", alpha.getName());
      */
   }
   
   
   /**  
   This tests the numberOfCones method.
   */
   @Test public void numConesTest() {
    
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      //forgot to change expected string to expected int
      Assert.assertEquals(3, iList.numberOfIceCreamCones());
        
       //from the previous, know that you have to reset
      //number of cones before counting
      /**
      alpha.resetCount();
      IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
      IceCreamCone blue = new IceCreamCone("blue", 1, 2);
      alpha.addIceCreamCone(blue);
      
      Assert.assertEquals(1, alpha.numberOfIceCreamCones());
   */
   }
   /** 
   This tests the totalSurfaceArea method.   
    */
   @Test public void totalSurfArTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      Assert.assertEquals(178.044094864, iList.totalSurfaceArea(), 0.000001);
      
      IceCreamConeList2 iList2 = new IceCreamConeList2("Empty", null, 0);
      Assert.assertEquals(0, iList2.totalSurfaceArea(), 0.000001);

      
      /*
      IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
      IceCreamCone blue = new IceCreamCone("blue", 1, 2);
      alpha.addIceCreamCone(blue);
      
      Assert.assertEquals(13.308000, alpha.totalSurfaceArea(), 0.000001);   
      */
   }
   
  /**  
      This test the averageSurfaceArea method.
   */
   @Test public void avgSurfArTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      Assert.assertEquals(59.34803162, iList.averageSurfaceArea(), 0.000001);
      
      IceCreamConeList2 iList2 = new IceCreamConeList2("Empty", null, 0);
      Assert.assertEquals(0, iList2.averageSurfaceArea(), 0.000001);   
   
   }
         
   /**  
   This test the totalVolume method.
   */
   @Test public void volTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      Assert.assertEquals(141.37166941, iList.totalVolume(), 0.000001);
     
     /**
     IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
     IceCreamCone blue = new IceCreamCone("blue", 1, 2);
     alpha.addIceCreamCone(blue);
      
     Assert.assertEquals(4.1887902, alpha.totalVolume(), 0.000001);         
    */
   }
   
   
   /**
   This tests the averageVolume method.
    */
   @Test public void avgVolTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      Assert.assertEquals(47.12388980, iList.averageVolume(), 0.000001);
      
      IceCreamConeList2 iList2 = new IceCreamConeList2("Empty", null, 0);
      //when you copy/paste, make sure to check method names
      Assert.assertEquals(0, iList2.averageVolume(), 0.000001);
     
     /**
     IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
     IceCreamCone blue = new IceCreamCone("blue", 1, 2);
     alpha.addIceCreamCone(blue);
      
     Assert.assertEquals(4.1887902, alpha.totalVolume(), 0.000001);     
      */   
   }
   /**  
     This tests the toString method.   
   */
   @Test public void toStringTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      Assert.assertEquals(true, iList.toString()
      /*Changed && to &*/            .contains("cherry"));
      //^ Removed & and left one word to check
   /**
     IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
     IceCreamCone blue = new IceCreamCone("blue", 1, 2);
     alpha.addIceCreamCone(blue);
     
     Assert.assertTrue(alpha.contains("blue"));
   */
   }      
   /** 
      This tests the summary method.
    */
   @Test public void summaryTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      Assert.assertEquals(true, iList.summaryInfo()
                                     .contains("IceCreamCone Objects: 3"));

     /**
     IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
     IceCreamCone blue = new IceCreamCone("blue", 1, 2);
     alpha.addIceCreamCone(blue);
     Assert.assertTrue(alpha.contains("Summary for blue"));   
      */
   }
   /** 
   This tests the getList method.
    */
   @Test public void getListTest() {
     /*
     IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 3);
     IceCreamCone blue = new IceCreamCone("blue", 1, 2);
     alpha.addIceCreamCone(blue);
     Assert.assertArrayEquals(feeder, alpha.getList());
     */
   }
   /** 
      This tests the readFile method.
      @throws IOException for file not found.
      
      //if checkstyle says expected throws tag after
      typing it, it means you have to describe it too.
    */
   @Test public void readFileTest() throws IOException {
     //remember to throw IOException
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", null, 0);
      iList = iList.readFile("IceCreamCone_data_1.txt");
      
      Assert.assertEquals("IceCreamCone Test List", iList.getName());

    /**
     IceCreamConeList2 alpha = new IceCreamConeList2("mainList", 
                                    IceCreamCone[] feeder, 0);
     alpha.readFile("IceCreamCone_data_1.txt");
     //IceCreamConeList2 itself is NOT an array
     Assert.assertEquals(
     */    
        
   }      
   
   /**  
   This tests the add method.
   */
   @Test public void addTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("peach", 2, 4);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      IceCreamCone pikachu = new IceCreamCone("pikachu", 1, 2);
      //error: Looking at the triangle example, you were about to 
      //try to enter the parameters but you can just insert the object name
      iList.addIceCreamCone("pikachu", 1, 2);
      // ^ changed to String, double, double
      IceCreamCone[] iA = iList.getList();
      
      Assert.assertEquals(pikachu, iA[3]);
   }
   /** 
     This tests the find method.
    */
   @Test public void findTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("snorlax", 3, 5);
      iArray[1] = new IceCreamCone("bulbasaur", 1, 2);
      iArray[2] = new IceCreamCone("chespin", 1, 2);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      
      IceCreamCone snorlax = new IceCreamCone("snorlax", 3, 5);
      Assert.assertEquals(snorlax, iList.findIceCreamCone("snorlax"));
      Assert.assertEquals(null, iList.findIceCreamCone("meowth"));
      
   }
   /** 
      This tests the delete method.
    */
   @Test public void deleteTest() {
      //THERE SHOULD BE A NULL CASE IN HERE
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("banana", 3, 5);
      
      iArray[1] = new IceCreamCone("bulbasaur", 1, 2);
      iArray[2] = new IceCreamCone("chespin", 1, 2);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      //clone IceCreamCones for array access
      IceCreamCone chespin = new IceCreamCone("chespin", 1, 2);
      IceCreamCone bulbasaur = new IceCreamCone("bulbasaur", 1, 2);
      
      //create new array and tack on the array from the top of ICCL2
      IceCreamCone[] iA = iList.getList();
      //check if the clone is identical to original
      Assert.assertEquals(bulbasaur, iA[1]);
      /**
      Snapshot below:
      Assert.assertTrue(iList.deleteIceCreamCone(bulbasaur));

      I attempted to pass the object name through the assertion.
      That failed. Error log says IceCreamCone can't be converted
      to string. Next, I'll try to pass the label as a string
             
      */
      //return type for delete is IceCreamCone not boolean
      //I changed expected from "bulbasaur" to bulbasaur
      Assert.assertEquals(bulbasaur, iList.deleteIceCreamCone("bulbasaur"));
      /**
      Here is where you check the delete method works. The index will shift
      for the object that comes after the one you deleted. I just
      realized that in the triangle example, the previous one was deleted
      instead of the one instantiated after the List2.
      
      I check if the index of IceCreamCone chespin has changed
       
      */
      Assert.assertEquals(chespin, iA[1]);
      /**
         The parent method accepts the label's name (a string)
         then checks if it matches an object in the array
         while ingnoring the case. If there is no match for the label
         the IceCreamCone at the top of the method remains null in
         the return statement. Based on that, I tried to assert
         the null case.
         Freeze! It compiled up to this point! 
        
      */
      Assert.assertEquals(null, iList.deleteIceCreamCone("not here"));
   }
   /** 
     This tests te edit method.
    */
   @Test public void editTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("cherry", 1, 2);
      iArray[1] = new IceCreamCone("eevee", 1, 2);
      iArray[2] = new IceCreamCone("banana", 3, 5);
      //forgot to define iList on previous compile
      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);

      //clone
      IceCreamCone eevee = new IceCreamCone("eevee", 1, 2);
      IceCreamCone sylveon = new IceCreamCone("sylveon", 4, 6);
      IceCreamCone[] iA = iList.getList();
      //pre edit
     
      Assert.assertEquals(eevee, iA[1]);
      
      /**
      eevee.editIceCreamCone("eevee", 2, 4);
      ^ I tried to edit the IceCreamCone with this line. Failed.

      */
      
            
      Assert.assertTrue(iList.editIceCreamCone("eevee", 2, 4));
      //^ I try to pass individual params in the line above on
      
      //do I have to have it in the array
      //do I have to create a new
      Assert.assertFalse(iList.editIceCreamCone("sylveon", 4, 6));

   }
   
   
 /*
 Methods above compile and pass. Below is where things get messy
 No grading yet.
 */
 
 /**
   This tests the shortestRadius test.
 */
   @Test public void shortRadTest() {
   /*
      Plan A: Using the find method as a guide, I'm going to
      create an array, define and index 3 objects,
      expect smallest, call method in terms of ICCL2 to check
      
      We have encountered a NullPointerException Error.

   */
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("lapras", 2, 4);
      iArray[1] = new IceCreamCone("psyduck", 3, 9);
      iArray[2] = new IceCreamCone("charmander", 4, 16);

      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      
      IceCreamCone lapras = new IceCreamCone("lapras", 2, 4);
      //might need delta
      Assert.assertEquals(lapras, iList.
                                  findIceCreamConeWithShortestRadius());   
      //create null array? <--- Fail
      //create null IceCreamCone? <--- Fail
      //IceCreamCone ditto = null;
      IceCreamConeList2 iList2 = new IceCreamConeList2("Test", null, 0);
      
      Assert.assertEquals(null, iList2.
                                findIceCreamConeWithShortestRadius());
                                
   }   
/**
This tests the longest radius test.
*/
   @Test public void longRadTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("lapras", 2, 4);
      iArray[1] = new IceCreamCone("psyduck", 3, 9);
      iArray[2] = new IceCreamCone("charmander", 4, 16);

      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      
      IceCreamCone charmander = new IceCreamCone("charmander", 4, 16);
      //might need delta?
      //^ does NOT need delta
      Assert.assertEquals(charmander, iList.
                                      findIceCreamConeWithLongestRadius());   
      
      IceCreamConeList2 iList2 = new IceCreamConeList2("Test", null, 0);
      
      Assert.assertEquals(null, iList2.
                                findIceCreamConeWithLongestRadius());

   }
/**
   This tests the smallesVolume test.
*/
   @Test public void smallVolTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("lapras", 2, 4);
      iArray[1] = new IceCreamCone("psyduck", 3, 9);
      iArray[2] = new IceCreamCone("charmander", 4, 16);

      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      
      IceCreamCone lapras = new IceCreamCone("lapras", 2, 4);
      Assert.assertEquals(lapras, iList.
                                  findIceCreamConeWithSmallestVolume());   
      
      IceCreamConeList2 iList2 = new IceCreamConeList2("Test", null, 0);
      
      Assert.assertEquals(null, iList2.
                                findIceCreamConeWithSmallestVolume());
   }
/**
This tests the largestVolume method.
*/
   @Test public void bigVolTest() {
      IceCreamCone[] iArray = new IceCreamCone[10];
      iArray[0] = new IceCreamCone("lapras", 2, 4);
      iArray[1] = new IceCreamCone("psyduck", 3, 9);
      iArray[2] = new IceCreamCone("charmander", 4, 16);

      IceCreamConeList2 iList = new IceCreamConeList2("Test", iArray, 3);
      
      IceCreamCone charmander = new IceCreamCone("charmander", 4, 16);
      Assert.assertEquals(charmander, iList.
                                      findIceCreamConeWithLargestVolume());   
      
      IceCreamConeList2 iList2 = new IceCreamConeList2("Test", null, 0);
      
      Assert.assertEquals(null, iList2.
                                findIceCreamConeWithLargestVolume());
   }
  
}
