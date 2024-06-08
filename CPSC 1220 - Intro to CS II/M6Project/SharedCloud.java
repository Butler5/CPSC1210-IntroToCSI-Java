import java.text.DecimalFormat;
/**
 * Program for CloudStorage.
 *
 * Project_04 - SharedCloud.java
 * Adam Butler - CPSC 1220 - A01
 * 11-06-22
 */
public class SharedCloud extends CloudStorage {
   
   protected double dataStored;
   protected double dataLimit;
   /**
    * Constant COST_FACTOR.
    */
   public static final double COST_FACTOR = 1.0;
   /** 
    * Constructor for SharedCloud.
    * @param nameIn for name input
    * @param baseStorageCostIn for storage cost input
    * @param dataStoredIn for data stored input
    * @param dataLimitIn for data limit input
    */
   public SharedCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn);
      dataStored = dataStoredIn;
      dataLimit = dataLimitIn;   
   }   
    /**
     * Method for getDataStored.
     * @return dataStored
     */
   public double getDataStored() {
      return dataStored;
   }
   /**
    * Method for setDataStored.
    * @param dataStoredIn for stored data input
    */
   public void setDataStored(double dataStoredIn) {
      dataStored = dataStoredIn;
   }
   /** 
    * Method for getDataLimit.
    * @return dataLimit
    */
   public double getDataLimit() {
      return dataLimit;
   }
   /**
    * Method for setDataLimit.
    * @param dataLimitIn for data limit input
    */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
    /**
     * Method for getCostFactor.
     * @return SharedCloud.COST_FACTOR
     */
   public double getCostFactor() {
      return SharedCloud.COST_FACTOR;
   }
    /** 
     * Method for daraOverage.
     * @return over
     */
   public double dataOverage() {
      double over = dataStored - dataLimit;
      if (over < 0) {
         return 0.0;
      }
      else {
         return over;
      }
   }
    /** 
     * Method for monthlyCost.
     * @return cost
     */
   public double monthlyCost() {
      double cost = baseStorageCost + dataOverage() * SharedCloud.COST_FACTOR;
      return cost;
   }
    /**
    * Method for toString.
    * @return output
    */
   public String toString() {
      DecimalFormat dataFormat = new DecimalFormat("0.000");
      
      String output = super.toString();
      
      output += "\nData Stored: " + dataFormat.format(getDataStored()) 
         + " GB\n" 
         + "Data Limit: " + dataFormat.format(getDataLimit()) + " GB\n"
         + "Overage: " + dataFormat.format(dataOverage()) + " GB\n"
         + "Cost Factor: " + getCostFactor();
      return output;
      
   }
}
