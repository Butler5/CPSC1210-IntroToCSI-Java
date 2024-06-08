/**
 * Program for number operations.
 *
 * Activity_05 - NumberOperations.java
 * Adam Butler - CPSC 1210 - A01
 * 09-14-22
 */

public class NumberOperations {
   private int number;
  /**
   * Constructor.
   *
   * @param numberIn for number input.
   */

   public NumberOperations(int numberIn) {
   
      number = numberIn;
   }
   /**
    * Method for getValue.
    *
    * @return number for value.
    */
   public int getValue() 
   {
      return number; // placeholder return
   }
   /**
    * String oddsUnder.
    *
    * @return output for oddUnder.
    */
   public String oddsUnder()
   {
      String output = "";
      
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }   
         i++;
      }
      return output;
   }
  /**
   * String for powers.
   *
   * @return output for powersTwoUnder.
   */
   public String powersTwoUnder() 
   {
      
      String output = "";
      int powers = 1;
      
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
   
   /**
    * Method isGreater.
    *
    * @param compareNumber to compare number.
    * @return int if greater, less than, or equal to.
    */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * Method for toString.
    *
    * @return s3 for string.
    */
   public String toString()
   {
   
      return number + "";
   }
  
}