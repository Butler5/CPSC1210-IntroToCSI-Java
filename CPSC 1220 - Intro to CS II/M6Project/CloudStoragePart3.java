import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Program for CloudStoragePart3.
 *
 * Project_06 - CloudStoragePart3.java 
 * Adam Butler - CPSC 1220 - AO2
 * 11-20-22
 */
public class CloudStoragePart3 {
    /** 
     * Main method.
     * @param args for args 
     */
   public static void main(String[] args) {
      
      String fileName;
      Scanner fileInput = null;
      int lineCount = 0;
      boolean found = false;
      Scanner keyboardInput = new Scanner(System.in);
      
      fileName = keyboardInput.nextLine();
      
      
      try {
         
         fileName = keyboardInput.nextLine().trim();
         if (fileName.equals("")) {
            System.out.println("File name expected as command "
               + "line argument." + "\nProgram ending.");
            return;
         }
         
         fileInput = new Scanner(new File(fileName));
         found = true;
         
         while (fileInput.hasNextLine()) {
            System.out.println(fileInput.nextLine());
         }
      }  
      catch (FileNotFoundException exceptObj) {
         System.out.println("*** Attempted to read file:" 
            + fileName + " (No such file or directory)");
      }
         
        // finally {
        //   if (fileInput != null) {
        //       fileInput.close();
        //    }
        // }
         
      
   }
}