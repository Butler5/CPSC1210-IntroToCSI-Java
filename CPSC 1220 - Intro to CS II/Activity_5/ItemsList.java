/**
 * Program for ItemsList.
 *
 * Project_05 - ItemsList.java
 * Adam Butler - CPSC 1220 - A01
 * 11-12-22
 */
public class ItemsList {
   
   private InventoryItem[] inventory;
   private int count;
   /**
    * Constructor ItemsList.
    */
   public ItemsList() {
      
      inventory = new InventoryItem[20];
      count = 0;
   }
    /**
     * Method for addItem.
     * @param itemIn for item input.
     */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
    /**
     * Method for calculateTotal.
     * @param electronicsSurcharge to calculate total
     * @return total
     */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         } 
      }
      return total;
   }
    /**
     * Method for toString.
     *
     * @return output
     */ 
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output; 
   }
   
}
