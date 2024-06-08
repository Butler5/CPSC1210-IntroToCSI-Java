import java.text.DecimalFormat;
/**
 * Program for CloudStorage.
 *
 * Project_04 - CloudStorage.java
 * Adam Butler - CPSC 1220 - A01
 * 11-06-22
 */
public abstract class CloudStorage {
   
   protected String name;
   protected double baseStorageCost;
   
   protected static int count = 0;
   /**
    * Constructor for CloudStorage.
    *
    * @param nameIn for name input.
    * @param baseStorageCostIn for base cloud storage cost.
    */
   public CloudStorage(String nameIn, double baseStorageCostIn) {
      name = nameIn;
      baseStorageCost = baseStorageCostIn;
      count++;
   }
    /** 
     * Method for getName.
     * @return name
     */
   public String getName() {
      return name;
   }
    /** 
     * Method for setName.
     * @param nameIn for name input
     */
   public void setName(String nameIn) {
      name = nameIn;
      
   }
   /**
    * Method for getBaseStorageCost.
    * @return baseStorageCost
    */
   public double getBaseStorageCost() {
      return baseStorageCost;
   }
    /**
     * Method for setBaseStorageCost.
     * @param baseStorageCostIn for base cloud storage cost.
     */
   public void setBaseStorageCost(double baseStorageCostIn) {
      baseStorageCost = baseStorageCostIn;
   }
    /**
     * Method for getCount.
     * @return count
     */
   public static int getCount() {
      return count;
   }
   /**
    * Method for resetCount.
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    * Method for toString.
    * @return output
    */
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      
      String output = name + " (" + this.getClass() + ")" 
         + " Monthly Cost: " 
         + costFormat.format(monthlyCost()) 
         + "\nBase Storage Cost: "
         + costFormat.format(getBaseStorageCost());
      
      return output;
   }
   /**
    * Method for monthlyCost.
    * @return monthlyCost
    */
   public abstract double monthlyCost(); 
    /**
     * Method for compareTo.
     * @param obj for cloud storage object
     * @return name
     */
   public int compareTo(CloudStorage obj) {
      return name.compareTo(obj.name);
   }
}