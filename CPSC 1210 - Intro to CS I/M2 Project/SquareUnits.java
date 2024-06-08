import java.util.Scanner;
/** 
 * Program for land size units. 
 *
 * M2 Project - SquareUnits.java
 * Adam Butler - CPSC 1210 - A01
 * 08-28-22
 */
public class SquareUnits {
   /**
    * Prints 4 units of measurement.
    *
    * @param args not used.
    */
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      String name = "";
     
      int squareInches = 0;
      
      //prompt user for area in square inches:
      System.out.print("Enter the area in square inches: ");
      squareInches = userInput.nextInt();
      
      int acres = squareInches / 6272640;
      int squareYards = squareInches % 6272640 / 1296;
      int squareFeet = squareInches % 6272640 % 1296 / 144;
      int remainder = squareInches % 6272640 % 1296 % 144;
      
      if (squareInches < 1000000000) {
         System.out.print("Number of Units: " 
            + "\n\tAcres: " + acres
            + "\n\tSquare Yards: " + squareYards
            + "\n\tSquare Feet: " + squareFeet
            + "\n\tSquare Inches: " + remainder);
      }
      else {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      }
   }
}