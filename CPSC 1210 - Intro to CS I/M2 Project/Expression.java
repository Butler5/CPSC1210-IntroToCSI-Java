import java.util.Scanner;
/**
 * Program for finding result of expression.
 *
 * M2 Project - Expression.java
 * Adam Butler - CPSC 1210 - A01
 * 08-28-22
 */
public class Expression {
  /** 
   * Prints results of expression.
   *
   * @param args not used. 
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = ("");
      double x = 0;
      double y = 0;
      double result = 0;
      
      //Prints expression
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      
      //Prompt user for x value:
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      
      //Prompt user for y value:
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      // Display result 
      if (x * y != 0) {
         result = (((10 * x + 32.6) * (5 * y - 1.567)) / (x * y));
         System.out.println("result = " + result);
      }
      else {
         System.out.println("result is \"undefined\"");
      }
   }
}