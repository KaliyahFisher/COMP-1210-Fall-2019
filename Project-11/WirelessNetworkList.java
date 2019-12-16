import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.NoSuchElementException;

/**
 * This is the driver for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */
public class WirelessNetworkList {
   private WirelessNetwork[] wireArray;
   private String[] invalidStream;
/**
 *Constructor, no params.
 */   
   public WirelessNetworkList() {
      wireArray = new WirelessNetwork[0];
      invalidStream = new String[0];
   }
/**
 *@return wireArray for main array
 */    
   public WirelessNetwork[] getWirelessNetworksArray() {
      return wireArray;
   }
/**
 *@return invalidStream for invalid array
 */     
   public String[] getInvalidRecordsArray() {
      return invalidStream;  
   }
   
/**
 *@param wireNet for network
 */     
   
   public void addWirelessNetwork(WirelessNetwork...wireNet) {
      //Remind me again what that ellipse operator does...
      //Think of it as an array. It just means that there 
      //will be an undetermined amount of wireless networks being feed in
      
         //create a for each loop 
      for (WirelessNetwork w : wireNet) {
         wireArray = Arrays.copyOf(wireArray, wireArray.length + 1);
         wireArray[wireArray.length - 1] = w;
      }
   
      /** Attempt 1
      int updater = 0;
      WirelessNetwork[] wireArrayUpdate = new WirelessNetwork[updater];
      wireArray = wireArrayUpdate;
      
      for (int i = 0; i < wireArray.length; i++) {
         if (wireNet instanceof WirelessNetwork) {
            wireArrayUpdate[updater] = wireNet;
            updater++;
         }
      }
      */
      
   }

/**
 *@param invalid takes in data
 */ 
   
   public void addInvalidRecord(String invalid) {
      invalidStream = Arrays.copyOf(invalidStream, invalidStream.length + 1);
      invalidStream[invalidStream.length - 1] = invalid;
   }
/**
 *@param fileNameIn takes in file name
 *@throws FileNotFoundException for missing file
 */    
   public void readFile(String fileNameIn) 
                     throws FileNotFoundException {
                               
      //Scanner reader = new Scanner(new File(fileNameIn));
      
      //reader.useDelimiter(",");
      //while (reader.hasNext()) {
   /**
      Plan A: 
      
      Inside of the while loop, 
      
      - Create a new scanner for delimiter
      - set fields of wirelessnetwork objects to scanner pickup
      - use an if statement to catch bad codes (too complicated)
      - use switch block
      - catch code with substring(0) method (err, charAt?)
   
   */
  
      Scanner alpha = new Scanner(new File(fileNameIn));
      while (alpha.hasNextLine()) {
         String dataStream = alpha.nextLine();
        //System.out.println(dataStream);
         Scanner beta = new Scanner(dataStream);
         beta.useDelimiter(",");
        
         char code = beta.next().charAt(0);
         String catChar = Character.toString(dataStream
                                   .charAt(0));                              
         String name;
         double bandwidth;
         double monthlyCost;
         double modemCost;   
         double time;
         double dataLimit;
               
         try {
            name = beta.next();
            bandwidth = Double.parseDouble(beta.next());
            monthlyCost = Double.parseDouble(beta.next());

                     
            switch (code) {
               //only W, C, L, and F allowed
               case 'W': 
                  modemCost = Double.parseDouble(beta.next());
                  WiFi w = new WiFi(name, bandwidth, monthlyCost, modemCost);
                  addWirelessNetwork(w);      
                  break;           

                  //Scanner miniReader = new Scanner(reader.nextLine())
                                 //.useDelimiter(",");
                  //Scanner miniReader = reader.nextLine();
   
                  //String name = reader.next();
                  //String name = miniReader.next.useDelimiter(",");
                  
                 
                  /**  Attempt 1
                  double bandwidth = Double.parseDouble(miniReader.next());
                  double monthlyCost = Double.parseDouble(miniReader.next());
                  double modemCost = Double.parseDouble(miniReader.next());
                  WiFi wifi = new WiFi(name, bandwidth, monthlyCost, modemCost);
                  break;
                  */
                              
                              
                  /** Attempt 2
                  double bandwidth = miniReader.nextDouble();
                  double monthlyCost = miniReader.nextDouble();
                  double modemCost = miniReader.nextDouble();
                  WiFi wifi = new WiFi(name, bandwidth, monthlyCost, modemCost);
                  */
                 
               case 'C':
                  time = Double.parseDouble(beta.next());
                  dataLimit = Double.parseDouble(beta.next());

                  Cellular c = new Cellular(name, bandwidth, monthlyCost,
                                        time, dataLimit);
                  addWirelessNetwork(c);
                  break;                  
                  

                  
               case 'L':
                  time = Double.parseDouble(beta.next());
                  dataLimit = Double.parseDouble(beta.next()); 
                  
                  LTE lte = new LTE(name, bandwidth, monthlyCost, 
                                                   time, dataLimit);
                  addWirelessNetwork(lte);
                  break;
               
               case 'F':
                  time = Double.parseDouble(beta.next());
                  dataLimit = Double.parseDouble(beta.next());
                     
                  FiveG fiveg = new FiveG(name, bandwidth, monthlyCost, 
                                       time, dataLimit);
                  addWirelessNetwork(fiveg);
                  break;
               
               default:
            /**
               I saw the first record was printed twice.
               Commenting it out here made it print one.
               In the default option of the switch block,
               only use a throw statement. Your catches
               will make use of the addInvalidRecord
               method.
            */
               //addInvalidRecord(dataStream);
                  throw new InvalidCategoryException(catChar);            

            }
         
         
         
         }
         
         catch (InvalidCategoryException e) {
            String error = "\n"
               + "For category: " + catChar; 
            addInvalidRecord(dataStream + "\n" + e);  
         }
         
         catch (NumberFormatException e) {
            String error =  "\n"
               + "For input string: " + "\"" + dataStream + "\"";
            addInvalidRecord(dataStream + "\n" + e); 
         }
         
         /*
         catch (NoSuchElementException e) {
            String error = dataStream + "\n" 
               + e.toString() + ": For missing input data";
            addInvalidRecord(error);
         }
         */
         
         catch (NoSuchElementException e) {
            String error = "\n" 
               + e.toString() + ": For missing input data";
            addInvalidRecord(dataStream + error);
         }
         
         
      }         
   }
   
/**   
 *@return result gives back list
 */     
   public String generateReport() {
      
      String result = "-------------------------------\n"
         + "Monthly Wireless Network Report\n"
         + "-------------------------------\n";
         
      for (WirelessNetwork w : wireArray) {
         result += w.toString()  + "\n\n";
      }
         
      return result;
   }
/**   
 *@return result gives back list
 */     
   public String generateReportByName() {
      Arrays.sort(getWirelessNetworksArray());
      /*String result = "-----------------------------------------"
         + "\nMonthly Wireless Network Report (by Name)"
         + "\n-----------------------------------------";
         
      for (WirelessNetwork w : wireArray) {
         result += "\n" + w.toString() + "\n";
      */
      String result = "-----------------------------------------\n"
         + "Monthly Wireless Network Report (by Name)\n"
         + "-----------------------------------------\n";
         
      for (WirelessNetwork w : wireArray) {
         result += w.toString() + "\n\n";
         
      }
         
                        
      return result;
   }
   
   
/**   
 *@return result gives back list
 */     
   public String generateReportByBandwidth() {
      Arrays.sort(getWirelessNetworksArray(), new BandwidthComparator());
      /*String result = "----------------------------------------------"
         + "\nMonthly Wireless Network Report (by Bandwidth)"
         + "\n----------------------------------------------";
         
      for (WirelessNetwork w : wireArray) {
         result += "\n" + w.toString() + "\n";         
      } */
      String result = "----------------------------------------------\n"
         + "Monthly Wireless Network Report (by Bandwidth)\n"
         + "----------------------------------------------\n";
  
      for (WirelessNetwork w : wireArray) {
         result += w.toString() + "\n\n";

      }     
      
      
      return result;
   }
/**   
 *@return result gives back list
 */   
   public String generateReportByMonthlyCost() {
      Arrays.sort(getWirelessNetworksArray(), new MonthlyCostComparator());
      /*
      String result = "-------------------------------"
         + "\nInvalid Records Report"
         +"\n-------------------------------";
         for (String i : invalidStream) {
            result += "\n" + i.toString() + "\n";
         }      
      */
      /*String result = "-------------------------------------------------"
         + "\nMonthly Wireless Network Report (by Monthly Cost)"
         + "\n-------------------------------------------------";
         
      for (WirelessNetwork w : wireArray) {
         result += "\n" + w.toString() + "\n";         
      }*/
      String result = "-------------------------------------------------\n"
         + "Monthly Wireless Network Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n";
         
      for (WirelessNetwork w : wireArray) {
         result += w.toString() + "\n\n";         
      }
      return result;
   }
   
/**   
 *@return result gives back list
 */      
   public String generateInvalidRecordsReport() {
      String result = "----------------------\n"
         + "Invalid Records Report\n"
         + "----------------------\n";
      for (String invalidRecord : invalidStream) {
         
         result += invalidRecord.toString() + "\n\n";
      }
      return result; 
   }
   
}

