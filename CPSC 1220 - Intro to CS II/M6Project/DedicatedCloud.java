import java.text.DecimalFormat;
/**
 * Program for CloudStorage.
 *
 * Project_04 - DedicatedCloud.java
 * Adam Butler - CPSC 1220 - A01
 * 11-06-22
 */
public class DedicatedCloud extends CloudStorage {
   
   private double serverCost;
   /**
    * Constructor for DedicatedCloud.
    *
    * @param nameIn for name input
    * @param baseStorageCostIn for base storage cost input
    * @param serverCostIn for server cost input
    */
   public DedicatedCloud(String nameIn, double baseStorageCostIn,
       double serverCostIn) { 
      super(nameIn, baseStorageCostIn);
      serverCost = serverCostIn;
   }
    /**
     * Method for getServerCost.
     * @return serverCost
     */
   public double getServerCost() {
      return serverCost;
   } 
    /**
     * Method for setServerCost.
     * 
     * @param serverCostIn for server cost input.
     */
   public void setServerCost(double serverCostIn) {
      serverCost = serverCostIn;
   }
   /**
    * Method for monthlyCost.
    *
    * @return total
    */
   public double monthlyCost() {
      double total = baseStorageCost + serverCost;
      return total;
   }
    /**
     * Method for toString.
     * 
     * @return output
     */
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      String output = super.toString();
      output += "\nServer Cost: " + costFormat.format(serverCost);
      return output;
   }
   
}
 
