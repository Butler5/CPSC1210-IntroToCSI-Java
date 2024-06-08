import java.util.ArrayList;
/**
 * Program for Temperatures.
 *
 * Activity_06 - Temperatures.java
 * Adam Butler - CPSC 1210 - A01
 * 09-22-22
 */
 
public class Temperatures {
   
   private ArrayList<Integer> temperatures;
   /**
    * Temperatures Constructor. 
    *
    * @param temperaturesIn by user input
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      
      temperatures = temperaturesIn;
   }
   /**
    * Method getLowTemp.
    *
    * @return low for lowest temp
    */ 
   public int getLowTemp() {
      
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      
      return low;
   }
   /**
    * Method for getHighTemp.
    *
    * @return high for high temp
    */
   public int getHighTemp() {
      
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      
      return high;
   }  
   /**
    * Method for lowerMinimum.
    *
    * @param lowIn for low temp input
    * @return lowIn if less than low temp
    */
   public int lowerMinimum(int lowIn) { 
      
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
    * Method for higherMaximum.
    *
    * @param highIn for high temp input
    * @return highIn if less than high temp
    */
   public int higherMaximum(int highIn) { 
      
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
    * Method for String.
    *
    * @return string for temps, low, and high
    */
   public String toString() {
      
      return "\tTemperatures: " + temperatures 
            + "\n\tLow: " + getLowTemp() 
            + "\n\tHigh: " + getHighTemp();
   } 
}