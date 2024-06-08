/**
 * Program for Division.
 *
 * Activity_06 - Division.java
 * Adam Butler - CPSC 1220 - AO1
 * 11-17-22
 */
public class Division {
    /**
     * Static method for intDivide.
     * 
     * @param numerator for numerator
     * @param denominator for denominator
     * @return 0
     */
   public static int intDivide(int numerator, int denominator) {
     
      try {
         return (numerator / denominator);
      }
      
      catch (ArithmeticException e) {
         return 0;
      }
   }
    /**
     * Static method for decimalDivide.
     * 
     * @param numerator for numerator
     * @param denominator for denominator
     * @return numerator
     */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return (double) numerator / (double) denominator;
   }
}