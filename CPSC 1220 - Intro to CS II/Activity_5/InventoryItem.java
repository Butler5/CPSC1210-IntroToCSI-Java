/**
 * Program for InventoryItem.
 *
 * Activity_04 - InventoryItem.java
 * Adam Butler - CPSC 1220 - AO1
 * 11-03-22
 */
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;
    /**
     * Constructor for InventoryItem.
     *
     * @param nameIn for name input.
     * @param priceIn for price input.
     */
   public InventoryItem(String nameIn, double priceIn) {
      this.name = nameIn;
      this.price = priceIn;
   }
    /**
     * Method for getName.
     *
     * @return name for customer name. 
     */
   public String getName() {
      return name;
   }
    /**
     * Method for calculateCost.
     *
     * @return price for item price
     */
   public double calculateCost() {
      return (price * (1 + taxRate));
     
   }
    /** 
     * Method for setTaxRate.
     *
     * @param taxRateIn for tax rate.
     */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
    /**
     * Method for toString.
     *
     * @return name for inventory name.
     */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}