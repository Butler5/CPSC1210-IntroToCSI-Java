/**
 * Program for InvalidCategoryException.
 *
 * Project_06 - InvalidCategoryException.java
 * Adam Butler - CPSC 1220 - AO2
 * 11-20-22
 */
public class InvalidCategoryException extends Exception {
   /**
    * Method for InvalidCategoryException.
    * @param categoryIn for category input
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }   
}