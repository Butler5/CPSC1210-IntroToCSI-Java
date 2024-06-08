import java.util.Comparator;
/**
* Program for MonthlyCostComparator.
*
* Project_05 - MonthlyCostComparator.java
* Adam Butler - CPSC 1220 - A01
* 11-13-22
*/
public class MonthlyCostComparator implements Comparator<CloudStorage> {
    /**
     * Method for compare.
     *
     * @param c1 for monthly cost 1
     * @param c2 for monthly cost 2
     * @return int
     */
   public int compare(CloudStorage c1, CloudStorage c2) {
      if (c1.monthlyCost() > c2.monthlyCost()) {
         return -1;
      }  
      else if (c1.monthlyCost() < c2.monthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   } 
}