import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * Program for Ellipsoid list menu app.
 *
 * Project_06 - EllipsoidListMenuApp.java
 * Adam Butler - CPSC 1210 - A01
 * 09-24-22
 */
public class EllipsoidListMenuApp 
{
   /**
    * Ellipsoid list program.
    * @param args not used.
    *
    * @throws FileNotFoundException if the file cannot be opened.
    */
   
   public static void main(String[] args) throws FileNotFoundException
   {
      String eListName = "no list name";
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      EllipsoidList myEList = new EllipsoidList(eListName, myList);
      String fileName = "no file name";
      
      double a, b, c;
      double label;
      
      String code = "";
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Ellipsoid List System Menu\n"
                       + "Read in File and Create Ellipsoid List\n"
                       + "P - Print Ellipsoid List\n"
                       + "S - Print Summary\n"
                       + "A - Add Ellipsoid\n"
                       + "D - Delete Ellipsoid\n"
                       + "F - Find Ellipsoid\n"
                       + "E - Edit Ellipsoid\n"
                       + "Q - Quit");
      
      do {
         System.out.print("Enter Code [R, P, S, L, T, A, D, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': 
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
                  
               myEList = myEList.readFile(fileName);
                  
               System.out.println("\tFile read in and "
                              + "Ellipsoid List created\n");
               break;
               
            case 'P': 
               System.out.println(myEList);
               break;
                  
            case 'S':
               System.out.println(myEList.summaryInfo());
               break;
               
            case 'A': // Add an ellipsoid
               System.out.print("\tlabel: ");
               label = Integer.parseInt(scan.nextLine());
               System.out.print("\tAxis a: ");
               a = Integer.parseInt(scan.nextLine());
               System.out.print("\tAxis b: ");
               b = Integer.parseInt(scan.nextLine());
               System.out.print("\tAxis c: ");
               c = Integer.parseInt(scan.nextLine());
                  
               myEList.addEllipsoid(label, a, b, c);
               System.out.print("\tEllipsoid added\n");
               break;
               
            case 'D': 
               System.out.print("\tlabel: ");
               label = Integer.parseInt(scan.nextLine());
               System.out.print("\tAxis a: ");
               a = Integer.parseInt(scan.nextLine());
               System.out.print("\tAxis b: ");
               b = Integer.parseInt(scan.nextLine());
               System.out.print("\tAxis c: ");
               c = Integer.parseInt(scan.nextLine());
                  
               if (myEList.deleteEllipsoid(a, b, c)) {
                  System.out.println("\t\"" + a + ", "
                                               + b + ", "
                                               + c + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + a + ", "
                                               + b + ", "
                                               + c 
                                               + "\" not found\n");
               }
               break;
               
            case 'F':
               System.out.print("\tlabel: ";
               
               if (myEList.label = Integer.parseInt(scan.nextLine());
               System.out.print
               break;
               
            case 'Q': 
               break;
                  
            default: 
               break;
         }
            
      } while (!code.equalsIgnoreCase("Q")); 
   }
}