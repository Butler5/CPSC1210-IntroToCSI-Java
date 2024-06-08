import java.util.Arrays;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
* Program for CloudStorageList.
*
* Project_06 - CloudStorageList.java
* Adam Butler - CPSC 1220 - A01
* 11-20-22
*/
public class CloudStorageList {

   private CloudStorage[] cList;
   private String[] invalidRecords;
   
   static final char D = 'D';
   static final char C = 'C';
   static final char S = 'S';
   static final char P = 'P';

/** Constructor for the class. */

   public CloudStorageList() {
   
      cList = new CloudStorage[0];
   
      invalidRecords = new String[0];
   
   }

/**
* Method to get the CloudStorage Array.
*
* @return cList is the cloud storage array.
*/

   public CloudStorage[] getCloudStorageArray() {
   
      return cList;
   
   }

/**
* Method to get the Invalid Records Array.
*
* @return invalidRecords is the record array.
*/

   public String[] getInvalidRecordsArray() {
   
      return invalidRecords;
   
   }

/**
* Method to add cloudStorage object to array.
*
* @param cloudObj is the obj.
*/

   public void addCloudStorage(CloudStorage cloudObj) {
   
      cList = Arrays.copyOf(cList, cList.length + 1);
   
      cList[cList.length - 1] = cloudObj;
   
   }

/**
* Method to add InvalidRecord object to array.
*
* @param line is the name of obj.
*/

   public void addInvalidRecord(String line) {
   
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
   
   }

/**
* Method to readFile.
*
* @param fileName is the name of file.
* @throws FileNotFoundException is when file isnt found.
*/

   public void readFile(String fileName) throws FileNotFoundException {
   
      Scanner fileScanner = new Scanner(new File(fileName));
   
      String line;
   
      while (fileScanner.hasNext()) {
      
         try {
         
            CloudStorage cloudObj;
         
            line = fileScanner.nextLine();
         
            Scanner lineScanner = new Scanner(line);
         
            lineScanner.useDelimiter(",");
         
            Character category = Character.toUpperCase(lineScanner
               .next().charAt(0));
         
            String name = lineScanner.next();
         
            double baseStorageCost = Double.parseDouble(lineScanner.next());
         
            switch (category) {
            
               case D:
               
                  double serverCost = Double.parseDouble(lineScanner.next());
               
                  cloudObj = new DedicatedCloud(name, baseStorageCost, 
                     serverCost);
               
                  addCloudStorage(cloudObj);
               
                  break;
            
               case C:
               
                  double dataStored = Double.parseDouble(lineScanner.next());
               
                  double dataLimit = Double.parseDouble(lineScanner.next());
               
                  cloudObj = new PublicCloud(name, baseStorageCost, 
                     dataStored, dataLimit);
               
                  addCloudStorage(cloudObj);
               
                  break;
            
               case S:
               
                  dataStored = Double.parseDouble(lineScanner.next());
               
                  dataLimit = Double.parseDouble(lineScanner.
                     next());
               
                  cloudObj = new SharedCloud(name, baseStorageCost, 
                     dataStored, dataLimit);
               
                  addCloudStorage(cloudObj);
               
                  break;
            
               case P:
               
                  dataStored = Double.parseDouble(lineScanner.next());
               
                  dataLimit = Double.parseDouble(lineScanner.next());
               
                  cloudObj = new PersonalCloud(name, baseStorageCost, 
                     dataStored, dataLimit);
               
                  addCloudStorage(cloudObj);
               
                  break;
            
               default:
               
                  throw new InvalidCategoryException("Break");
               
                  
            
            }
         
         } 
         catch (NumberFormatException | InvalidCategoryException 
            | NoSuchElementException e) {
         
            line = "\n" + e.getMessage();
         
            addInvalidRecord(line);
         
         }
      
      }
   
   }

/**
* Method to generate report in standard form.
*
* @return report is the report
*/

   public String generateReport() {
   
      String report;
   
      report = "-------------------------------" 
         + "\nMonthly Cloud Storage Report"
         
         + "\n-------------------------------";
   
      for (CloudStorage cloudObj : cList) {
      
         report += "\n" + cloudObj + "\n";
      
      }
   
      return report;
   
   }

/**
* Method to generate report sorted by name.
*
* @return report is the report
*/

   public String generateReportByName() {
   
      String report;
   
      report = "\n-----------------------------------------" 
         + "\nMonthly Cloud Storage Report (by Name)"
         
         + "\n-----------------------------------------";
   
      Arrays.sort(getCloudStorageArray());
   
      for (CloudStorage cloudObj : cList) {
      
         report += "\n" + cloudObj + "\n";
      
      }
   
      return report;
   
   }

/**
* Method to generate report sorted by monthly Cost.
*
* @return report is the report   
*/

   public String generateReportByMonthlyCost() {
   
      String report;
   
      report = "\n-------------------------------------------------"
         
         + "\nMonthly Cloud Storage Report (by Monthly Cost)"
         
         + "\n-------------------------------------------------";
   
      Arrays.sort(getCloudStorageArray(), new MonthlyCostComparator());
   
      for (CloudStorage cloudObj : cList) {
      
         report += "\n" + cloudObj + "\n";
      
      }
   
      return report;
   
   }
    /**
     * Method for generateInvalidRecordsReport.
     * @return rString
     */
   public String generateInvalidRecordsReport() {
      Arrays.sort(getInvalidRecordsArray());
      String rString = "------------------\n";
      rString += "Invalid Records Report\n";
      rString += "--------------------\n";
      
      for (int i = 0; i < cList.length; i++) {
         CloudStorage cloudObj = cList[i];
         rString = rString + cloudObj.toString() + "\n\n";
      }
      return rString;
   }
}