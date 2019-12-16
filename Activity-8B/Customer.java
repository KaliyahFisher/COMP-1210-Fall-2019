/**
 *This program calculates the area of two shapes to build an ice cream cone.
 *@author Kaffeein Bellamy
 *@version 13/9/2019
 */  
public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;
/**
 *This program builds an customer profile.
 *@param nameIn feeds private var name.
 */   
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
/**
 *@param obj is an object
 *@return returns comparison
 */   
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
/**
 *@param locationIn feeds location
 */      
   public void setLocation(String locationIn) {
      //directions assume you understand what to put in
      //based on what the method is said to do
      //void methods cannot be empty
      location = locationIn;
   }
   //a void method can accept parameters
/**
 *@param amount is added to balance
 */     
   public void changeBalance(double amount) {
      //I learned that you can declare new variables
      //  inside of the method's parentheses
      //directions said method adds amount to balance
      //but never explicitly said what to put inside
      //below is what I assume goes inside
      balance += amount;
   }
/**
 *@return gives location.
 */       
   public String getLocation() {
      return location;
   }
/**
 *@return gives balance.
 */       
   public double getBalance() {
      return balance;
   }
   //this method appears to be a failsafe just in case
   //the mid user or enduser concats the city and state
   //seperately 
/**
 *@param city is customer city
 *@param state is customer state
 */      
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
/**
 *@return formats info.
 */    
   public String toString() {
      return name + "\n" + getLocation() + "\n"
         + "$" + getBalance();
      
   }
}
