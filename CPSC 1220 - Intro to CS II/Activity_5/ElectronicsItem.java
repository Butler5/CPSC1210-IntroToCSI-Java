/**
 * Program for ElectronicsItem.
 *
 * Activity_04 - ElectronicsItem.java
 * Adam Butler - AO1
 * 11-03-22
 */
public class ElectronicsItem extends InventoryItem {
   
   protected double weight;
   /**
    * Constant for shipping cost.
    */
   public static final double SHIPPING_COST = 1.5;
   /**
    * Constructor for ElectronicsItem.
    *
    * @param nameIn for name input
    * @param priceIn for price input
    * @param weightIn for weight input
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
    * Method for calculateCost.
    * @return super.calculateCost
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}