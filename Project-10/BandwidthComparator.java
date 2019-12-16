import java.util.Comparator;
/**
 * This is the driver for the WNW Part1.
 *@author Kaffeein Bellamy
 *@version 11/20/2019
 */

public class BandwidthComparator implements Comparator<WirelessNetwork> {
/**
 *@return gives a comparing int
 *@param n1 is first
 *@param n2 is second
 */    
    
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
       
      if (n1.getBandwidth() > n2.getBandwidth()) {
         return 1;
      }

      else if (n1.getBandwidth() < n2.getBandwidth()) {
         return -1;
      }
      else {
         return 0;
      }
   }
}