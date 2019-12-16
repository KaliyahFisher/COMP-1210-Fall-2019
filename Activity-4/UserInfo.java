/**
 *This program reports the status of a user.
 *@author Kaffeein Bellamy
 *@version 13/9/2019
 */
public class UserInfo {
/**
 *Program tells if offline or online.
 *@param args Command line arguments (not used).
 */
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
      
   // constructor
   /**
    * Class holds user info parameters.
    * @param firstNameIn gives user's first name
    * @param lastNameIn gives user's last name
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   } 
/**
 *Method converts data to string and displays it.
 *@return output
 */      
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
         
      return output;
   }
   /**
    *Method returns parameters.
    *@param locationIn changes location
    */         
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    *Method determines if age is set.
    *@param ageIn gives user's age
    *@return isSet
    */ 
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    *Method returns age.
    *@return age
    */ 
   public int getAge() {
      return age;
   }
   /**
    *Method returns location.
    *@return location
    */ 
   public String getLocation() {
      return location;
   }
   /**
    *Method changes status to OFFLINE when logOff() is inacted.
    */ 
   public void logOff() {
      status = OFFLINE;
   }
   /**
    *Method changes status to ONLINE when logOn() is inacted.
    */ 
   public void logOn() {
      status = ONLINE;
   }
}