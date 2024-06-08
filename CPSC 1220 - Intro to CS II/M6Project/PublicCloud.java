/**
 * Program for PublicCloud.
 *
 * Project_04 - PublicCloud.java
 * Adam Butler - CPSC 1220 - A01
 * 11-06-22
 */
public class PublicCloud extends SharedCloud {
   /**
    * Constant COST_FACTOR.
    */
   public static final double COST_FACTOR = 2.0;
    /**
     * Constructor for PublicCloud.
     *
     * @param nameIn for name input
     * @param baseStorageCostIn for base storage cost input
     * @param dataStoredIn for data stored input
     * @param dataLimitIn for data limit input
     */
   public PublicCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);  
   }
    /** 
     * Method for getCostFactor.
     * @return COST_FACTOR
     */
   public double getCostFactor() {
      return COST_FACTOR;
   }
    /**
     * Method for monthlyCost.
     * @return baseStorageCost
     */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PublicCloud.COST_FACTOR;
   }
}