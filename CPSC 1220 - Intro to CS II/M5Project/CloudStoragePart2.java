import java.io.FileNotFoundException;
/**
 * Program for CloudStoragePart2.
 *
 * Project_05 - CloudStoragePart2.java
 * Adam Butler - CPSC 1220 - A01
 * 11-13-22
 */
public class CloudStoragePart2 {
    /**
     * Main method with FileNotFoundException.
     * @param args for args
     * @throws FileNotFoundException if file not found 
     */
   public static void main(String[] args) throws FileNotFoundException {
      
      if (args.length > 0) {
         String filenamein = args[0];
         CloudStorageList listobject1 = new CloudStorageList();
         listobject1.readFile(filenamein);
         
         String report1 = listobject1.generateReport();
         String report2 = listobject1.generateReportByName();
         String report3 = listobject1.generateReportByMonthlyCost();
         
         System.out.print(report1 + report2 + report3);
      }
      else {
         System.out.print("File name expected as command line argument."
            + "\nProgram ending." + "\n");
      }
   }
}