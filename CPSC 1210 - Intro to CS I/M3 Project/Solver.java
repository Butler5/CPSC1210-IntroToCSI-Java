import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program to solve specified expression.
 *
 * M3 Project - Solver.java
 * Adam Butler - CPSC 1210 -  A01
 * 09-04-22
 */
public class Solver {
  /**
   * Solves expression for a value x.
   *
   * @param args not used.
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
   
      double x;
      double result;
   
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      result = ((Math.sqrt(Math.abs(11 * Math.pow(x, 4) + 9 * Math.pow(x, 3) 
         + 7 * Math.pow(x, 2) + 5 * x + 4))) / (2 * x + 4));
      
      System.out.println("Result: " + result);
      
      String r = Double.toString(result);
      
      System.out.println("# of characters to left of decimal point: " 
         + r.indexOf("."));
      
      System.out.println("# of characters to right of decimal point: " 
         + (r.length() - r.indexOf(".") - 1));
      
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");
      
      System.out.println("Formatted Result: " + fmt.format(result));
   
   }
}