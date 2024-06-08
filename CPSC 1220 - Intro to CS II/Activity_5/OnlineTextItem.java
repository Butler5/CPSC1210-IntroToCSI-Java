/**
 * Program for OnlineTextItem.
 *
 * Activity_04 - OnlineTextItem.java
 * Adam Butler - AO1
 * 11-03-22
 */
public abstract class OnlineTextItem extends InventoryItem {
    /**
     * Constructor for OnlineTextItem.
     *
     * @param nameIn for name input
     * @param priceIn for price input
     */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }  
    /**
     * Method for calculateCost.
     * @return price
     */
   public double calculateCost() {
      return price;
   }
   
   
}