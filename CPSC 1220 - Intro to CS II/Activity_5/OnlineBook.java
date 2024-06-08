/**
 * Program for OnlineTextItem.
 *
 * Activity_04 - OnlineTextItem.java
 * Adam Butler - CPSC 1220 - AO1
 * 11-03-22
 */
public class OnlineBook extends OnlineTextItem {
   
   protected String author;
    /**
     * Constructor for OnlineBook.
     * @param nameIn for name input
     * @param priceIn for price input
     * 
     */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
    /**
     * Method for toString.
     * @return name 
     */
   @Override public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }
    /**
     * Method for setAuthor.
     * @param authorIn for author input.
     *
     */
   public void setAuthor(String authorIn) {
      this.author = authorIn;
   }
}