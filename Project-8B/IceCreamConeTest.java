import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *This program calculates the area of two shapes to build an ice cream cone.
 *@author Kaffeein Bellamy
 *@version 13/9/2019
 */
public class IceCreamConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   *This tests getters.
   */
   @Test public void gettersTest() {
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14); 
      
      Assert.assertEquals("label test", "peach", alpha.getLabel());
      Assert.assertEquals("radius test", 13, alpha.getRadius(), .000001);
      Assert.assertEquals("height rest", 14, alpha.getHeight(), .000001);
       
   }
   /**
   *This tests setters.
   */   
   //note, all the methods tested here are boolean
   @Test public void settersTest() {
      /*
      for type boolean tests:
         -declare a new object
         -Assert.assertTrue(error message, 
                  object.method(parameter from object required));
      */
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14); 
       
      
      Assert.assertTrue(" ", alpha.setLabel("peach"));
      
      Assert.assertTrue(" ", alpha.setRadius(13));
      Assert.assertTrue(" ", alpha.setHeight(14));
      
      Assert.assertFalse(" ", alpha.setLabel(null));
      Assert.assertFalse(" ", alpha.setRadius(0));
      Assert.assertFalse(" ", alpha.setHeight(0)); 
   }
   /**
   *This tests surface area.
   */   
   @Test public void surfaceAreaTest() {
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      //what params go here?
      Assert.assertEquals(" ", 1842.118880, alpha.surfaceArea(), .000001);
   }
   /**
   *This tests volume.
   */      
   @Test public void volumeTest() {
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      Assert.assertEquals(" ", 7079.0554460, alpha.volume(), .000001);
   }
   /**
   *This tests the toString method.
   */   
   @Test public void toStringTest() {
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      Assert.assertEquals("toString test", true, 
                           alpha.toString().contains("peach"));
                           
   }
   /**
   *This tests the getCount method.
   */     
   @Test public void getCountTest() {
      /**
         Create new Icecreamcone, fetch number of objects
         reset the number of objects
         create ANOTHER object
         get the count again
         
         The reason you have to reset it is because without that
         the getCount will count ALL of the IceCreamCone objects
         in the test file. I discovered this in the error log.
         
         java.lang.AssertionError: expected:<1> but was:<8>
      */
     
      
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      alpha.resetCount();
      IceCreamCone beta = new IceCreamCone("peach", 13, 14);
      
      Assert.assertEquals(" ", 1, alpha.getCount());
   }
   
   //the parent method returns nothing. what to do here?
   // remember, a static method does NOT require an object to work
   /**
   *This tests the resetCount method.
   */     
   @Test public void resetCountTest() {
      /**
         Thoughts: I cannot directly access the count variable 
         because it is private. I think I need to create an
         IceCreamCone, which increments count by 1. Then
         I can call the resetCount() method in terms of the 
         object. In the assertion, I can check if the 
         getCount method returns 0. 
      */
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      alpha.resetCount();
      //IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      Assert.assertEquals(" ", 0, IceCreamCone.getCount());
   }
   
   /**
   *This tests the equals method.
   */     
   @Test public void equalsTest() {
   
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      String str = "apple";
      
      Assert.assertFalse("", alpha.equals(str)); //if tested
      IceCreamCone beta = new IceCreamCone("peach", 12, 14);
      Assert.assertFalse(" ", beta.equals(alpha));
      IceCreamCone gamma = new IceCreamCone("lion", 13, 14);
      Assert.assertFalse(" ", gamma.equals(alpha));
      IceCreamCone delta = new IceCreamCone("cat", 11, 11);
      Assert.assertFalse(" ", delta.equals(alpha));
     
      
      IceCreamCone epsilon = new IceCreamCone("peach", 13, 14);
      Assert.assertTrue(" ", alpha.equals(epsilon));
      
      IceCreamCone sierra = new IceCreamCone("peach", 13, 15);
      Assert.assertFalse(" ", alpha.equals(sierra));
   
         /**
         Thoughts: The parent method is of type boolean
         which means that the return type is true or
         false. In turn, this means the test method must 
         either assert true or assert false. 
         
               But where is true? The logical not operator
               (!) handles that. It makes the condition of 
               the if evaluate to true. 
               
         The parent method accepts a parameter type Object
         ("Object" IS the data type, in case you weren't
         paying attention). If the object is NOT an
         (instance of the class) IceCreamCone, the method
         returns false. Else, a new IceCreamCone (with
         another name) is created by casting the Object to
         type IceCreamCone. Then the method returns the label,
         radius, and height of the new IceCreamCone
         
               But what about &&? You've learned them earlier 
               in the book, but you haven't used them until
               now. This is called a conditional and. It 
               returns true if both functions surrounding it
               are true. If both functions are false, it will
               return false.
               
        Now, onto this test. I think I'd have to create an Object
        and assign it label, radius, and height as a string.
        Then I assert it false to check it in the test.
        
        then I can create a new IceCreamCone assigned the cast
        of the Object to type IceCreamCream. 
        
            ^ Plan failed
            
        Plan B: Create an IceCreamCone object, create an Object
        with the parameters of an IceCreamCone as a string, cast
        Object to another IceCreamCone. Then assert the object to
        be false, and assert the new IceCreamCone true.
              ^ This Compiles, but it fails
                Error is from string being cast to IceCreamCone
                
         Plan C: Only change Object to use new operator
              ^ Plain failed
                Error says no arguments required.
                
         Plan D: Create a public constructor for Object and pass args
         (I thought to create variables, but I changed my mind)
            ^ Plan failed. 
            It adds about 10 more errors. Deleting it takes it to 1.
            
            Between code of C to D 
                     IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
                     Object beta = new Object("banana", 13, 14);
                     IceCreamCone gamma = (IceCreamCone) beta;
                     
                     //Assert.assertTrue(" ", IceCreamCone.equals(obj)); 
                        // ^ NO
                     Assert.assertFalse(" ", alpha.equals(beta));
                     Assert.assertTrue(" ", beta.equals(gamma));
         
         Plan E: Hint arrived. It's long. You can try to recreate the
         entire class of IceCreamCone but replace the word IceCreamCone
         with Object. 
         
         Plan F: Or you can create two IceCreamCones and compare them.
            ^This compiles, but fails
         Plan G:
         
         IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
         IceCreamCone beta = new IceCreamCone("peach", 13, 14);
   
         Assert.assertTrue(alpha == alpha);
         Assert.assertFalse(alpha.equals(beta) && beta.equals(alpha));
         Assert.assertTrue(alpha.hashCode() == beta.hashCode());
            ^Compiles, runs without error, but webcat says it did not 
               test correctly
               
         Plan H: Clone the IceCreamCone class but replace every instance
         of IceCreamCone with Object
         
         
      */
      
      
   }
   /**
   *This tests the hashCode method.
   */     
   @Test public void hashCodeTest() {
      
      IceCreamCone alpha = new IceCreamCone("peach", 13, 14);
      
      Assert.assertEquals(" ", 0, alpha.hashCode());
   }
   
   
}
