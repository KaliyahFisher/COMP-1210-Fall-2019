import java.io.IOException;
/**
 * This is the driver for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */
public class WirelessNetworksPart2 {
/**
 *@param args for fileName
 *@throws IOException for missing file
 */
   public static void main(String[] args) throws IOException {
      

      if (args.length <= 0) {
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
      
      else {  
         //String fileName = "wireless_network_data1.csv";
         String fileName = args[0];
         WirelessNetworkList wList  = new WirelessNetworkList();
         wList.readFile(fileName);
         //chaning println to print fixes double space error
         System.out.print(wList.generateReport());
         System.out.print(wList.generateReportByName());
         System.out.print(wList.generateReportByBandwidth());
         System.out.print(wList.generateReportByMonthlyCost());      
      }
         

   } 
   
   
}