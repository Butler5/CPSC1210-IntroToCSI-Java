/**
 * Program for Scores.
 *
 * Activity_03 - Scores.java
 * Adam Butler - CPSC 1220 - A01
 * 10-25-22
 */
public class Scores { 
   
   private int[] numbers;
 
  /**
   * Method for Scores.
   *
   * @param numbersIn for numbers in.
   */ 
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
      return;
   }
   /**
    * Method for findEvens.
    *
    * @return evens
    */
   public int[] findEvens() {
   
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }   
      }
      return evens;
   }
   /**
    * Method for findOdds.
    *
    * @return odds.
    */
   public int[] findOdds() {
      
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   /**
    * Method for calculating average.
    *
    * @return result
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return sum / numbers.length;
   }
   /** 
    * Method for string results.
    *
    * @return result
    */
   public String toString() {
      
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /**
    * Method for string results in reverse.
    *
    * @return result
    */
   public String toStringInReverse() {
      
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
      return result;
   }
}