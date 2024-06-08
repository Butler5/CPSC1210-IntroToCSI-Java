import java.util.Scanner;
/**
 * Program for Ellipsoid App.
 *
 * Project_04 - EllipsoidApp.java
 * Adam Butler - CPSC 1210 - A01
 * 09-11-22
 */
public class EllipsoidApp {

/**
 * Class for ellipsoid app.
 * @param args not used.
 */
   public static void main(String[] args) {
   
      Ellipsoid ellipsoid1 = new Ellipsoid("", 0, 0, 0);
   
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\n\tlabel: ");
      String label = input.nextLine();
      System.out.print("\ta: ");
      double a = Double.parseDouble(input.next());
   
      if (!ellipsoid1.setA(a)) {
      
         System.out.print("Error: axis value must be positive.");
         
         return;
         
         
      }
      
      System.out.print("\tb: ");
      double b = Double.parseDouble(input.next());
   
      if (!ellipsoid1.setB(b)) {
      
         System.out.print("Error: axis value must be positive.");
         
         return;
      }
   
      System.out.print("\tc: ");
      double c = Double.parseDouble(input.next());
   
      if (!ellipsoid1.setC(c)) {
      
         System.out.println("Error: axis value must be positive.");
         
         return;
      }
   
      ellipsoid1 = new Ellipsoid(label, a, b, c);
   
      System.out.println("\n" + ellipsoid1);
   }

}