/**
 * Program for CloudStorage.
 *
 * Project_04 - PersonalCloud.java
 * Adam Butler - CPSC 1220 - A01
 * 11-06-22
 */
public class PersonalCloud extends SharedCloud {
   /**
    * Constant for COST_FACTOR.
    */
   public static final double COST_FACTOR = 3.0;
    /**
     * Constructor for PersonalCloud.
     *
     * @param nameIn for name input
     * @param baseStorageCostIn for base storage cost
     * @param dataStoredIn for data stored
     * @param dataLimitIn for data limit
     */
   public PersonalCloud(String nameIn, double baseStorageCostIn, 
      double dataStoredIn, double dataLimitIn) {
      super(nameIn, baseStorageCostIn, dataStoredIn, dataLimitIn);  
   }
   /**
    * Method for getCostFactor.
    * @return PersonalCloud.COST_FACTOR
    */
   public double getCostFactor() {
      return PersonalCloud.COST_FACTOR;
   }  
    /**
     * Method for monthlyCost.
     * @return baseStorageCost
     */
   public double monthlyCost() {
      return baseStorageCost + dataOverage() * PersonalCloud.COST_FACTOR;
   }
   
   
}