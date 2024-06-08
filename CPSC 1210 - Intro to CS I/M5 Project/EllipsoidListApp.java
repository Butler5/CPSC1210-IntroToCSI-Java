import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * Program for ellipsoid list app.
 *
 * Project_05
 * Adam Butler - CPSC 1210 - A01
 * 09-18-22
 */ 
public class EllipsoidListApp {
 /**
  * Throws filenotfoundexception if no file found.
  *
  * @param args not used.
  * @throws FileNotFoundException if no file found
  */
   public static void main(String[] args) throws FileNotFoundException { 
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = keyboard.nextLine();
      
      keyboard.close();
      
      System.out.println();
      
      ArrayList<Ellipsoid> elist = new ArrayList<Ellipsoid>();
      
      Scanner infile = new Scanner(new File(fileName));
      
      String name = infile.nextLine();
      
      while (infile.hasNext()) {
      
         String ename = infile.nextLine();
         double a = infile.nextDouble();
         double b = infile.nextDouble();
         double c = infile.nextDouble();
         if (infile.hasNext()) {
            infile.nextLine();
         }
         elist.add(new Ellipsoid(ename, a, b, c));
      }
      infile.close();
      
      EllipsoidList app = new EllipsoidList(name, elist);
         
      System.out.println(app.toString());
      
      System.out.println();
      
      System.out.println(app.summaryInfo());
   }
}