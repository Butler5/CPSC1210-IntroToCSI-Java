/**
 * Program for OnlineArticle.
 *
 * Activity_04 - OnlineArticle.java
 * Adam Butler - CPSC 1220 - AO1
 * 11-03-22
 */
public class OnlineArticle extends OnlineTextItem {
   
   private int wordCount;
    /**
     * Constructor for OnlineArticle.
     * 
     * @param nameIn for name input
     * @param priceIn for price input
     * 
     */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
    /**
     * Method for setWordCount.
     * @param wordCountIn for word count
     * 
     */
   public void setWordCount(int wordCountIn) {
      this.wordCount = wordCountIn;
   }
}