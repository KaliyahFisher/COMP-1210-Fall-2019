//import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * This is the driver for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */
public class WirelessNetworksPart3 {
/**
 *@param args for fileName
 *@throws FileNotFoundException for missing file
 */
   public static void main(String[] args) {
      

      if (args.length <= 0) {
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
      
      else { 
         try { 
            //String fileName = "wireless_network_data1.csv";
            String fileName = args[0];
            WirelessNetworkList wList  = new WirelessNetworkList();
            wList.readFile(fileName);
            //chaning println to print fixes double space error
            System.out.print(wList.generateReport());
            System.out.print(wList.generateReportByName());
            System.out.print(wList.generateReportByBandwidth());
            System.out.print(wList.generateReportByMonthlyCost());      
            System.out.print(wList.generateInvalidRecordsReport());
         }
         catch (FileNotFoundException e) {
            System.out.print("*** Attempted to read file: " + args[0]
                        + " (No such file or directory)");
         }
      
      
      }            

   } 
   
   
}
