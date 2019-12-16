import java.text.DecimalFormat;
/**
 *This program calculates the area of two shapes to build an ice cream cone.
 *@author Kaffeein Bellamy
 *@version 13/9/2019
 */
public class IceCreamCone {
/**
 *This program builds an ice cream cone.
 */
   //instance variables
   private double radius = 0;
   private double height = 0;
   private String label = "";
   private static int count = 0;

   // constructor
   /**
    * Class holds ice cream parameters.
    * @param labelIn is the ice cream name
    * @param radiusIn is the hemisphere and cone radius
    * @param heightIn is the height of the hemisphere and cone
    */
   public IceCreamCone(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
      //increment the count in the public constructor
      count++;
   } 
 /**
 *Method sets label.
 *@param labelIn modifies label
 *@return isLabelDefined tells if label is valid length.
 */ 
   public boolean setLabel(String labelIn) {
      boolean isLabelDefined = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isLabelDefined = true;
      }
      return isLabelDefined;
   }
 /**
 *Method sets radius.
 *@param radiusIn modifies radius data.
 *@return isRadiusDefined tells if radius is greater than zero.
 */     
   public boolean setRadius(double radiusIn) {
      boolean isRadiusDefined = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isRadiusDefined = true;
      }
      return isRadiusDefined;
   } 
 /**
 *Method sets height.
 *@param heightIn modifies height.
 *@return isHeightDefined tells is height is greater than zero.
 */      
   public boolean setHeight(double heightIn) {
      boolean isHeightDefined = false;
      if (heightIn > 0) {
         height = heightIn;
         isHeightDefined = true;
      }
      return isHeightDefined;
   }
 /**
 *Method delivers label.
 *@return label gives the ice cream cone's name.
 */       
   public String getLabel() {
      return label;
   }
 /**
 *Method delivers radius.
 *@return radius gives the ice cream cone's radius in units.
 */      
   public double getRadius() {
      return radius;
   }
 /**
 *Method delivers height.
 *@return height gives the ice cream cone's height in units.
 */      
   public double getHeight() {
      return height;
   }  
 /**
 *Method delivers surface area.
 *@return gives the calculation of the surface area
 */  
   public double surfaceArea() {
      return Math.PI * radius * (Math.sqrt((Math.pow(height, 2) 
         + Math.pow(radius, 2)))) + 2 * Math.PI * Math.pow(radius, 2);

   }
 /**
 *Method delivers volume.
 *@return gives the calculation of the volume.
 */  
   public double volume() {
      return ((height * Math.PI * Math.pow(radius, 2)) / 3) 
         + 2 * Math.PI * Math.pow(radius, 3) / 3;
   }
   
 /**
 *Method turns data to strings.
 *@return output prints everything.
 */    
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0######");
      String output = "IceCreamCone " + "\"" + label 
         + "\"" + " with radius = " + radius;
      output += " and height = " + height 
         + " units has:\n\tsurface area = " + df.format(surfaceArea());
      output += " square units" + "\n\tvolume = " 
         + df.format(volume()) + " cubic units"; 
      return output;
   }
 /**
 *Method gives count of objects.
 *@return count delivers an int.
 */    
   public static int getCount() {
      return count;
   }
 /**
 *Method resets count.
 */    
   public static void resetCount() {
      count = 0;
   }
 /**
 *Method turns data to strings.
 *@param obj is checked as IceCreamCone
 *@return checks if an object was created
 */    
 
 //
   public boolean equals(Object obj) {
      
      if (!(obj instanceof IceCreamCone)) {
         return false;
      }
      else {
         IceCreamCone icc = (IceCreamCone) obj;
         return (label.equalsIgnoreCase(icc.getLabel())
            && Math.abs(radius - icc.getRadius()) < .000001
            && Math.abs(height - icc.getHeight()) < .000001);
      }
   }
 /**
 *@return is for the test case
 */    
   public int hashCode() {
      return 0;
   }
}
