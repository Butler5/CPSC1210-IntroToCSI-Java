import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Program for Ellipsoid List.
 *
 * Project_05
 * Adam Butler - CPSC 1210 - A01
 * 09-18-22
 */
public class EllipsoidList {

   private String listName;
   private ArrayList<Ellipsoid> eList; 
   
               
  /**
   * Constructors.
   *
   * 
   * @param listNameIn uses ArrayList
   * @param eListIn for string list
   */
 
   public  EllipsoidList(String listNameIn, ArrayList<Ellipsoid> eListIn) {
      listName = listNameIn;
      eList = eListIn;
   } 
   
   /**
    * Methods.
    *
    * @return list for getName.
    */
   public String getName() {
      
      return listName;
   }
   
   /**
    * Returns number of ellipsoids on list.
    *
    * @return ellipsoidList.size
    */
   public int numberOfEllipsoids() {
      return eList.size();
   }
   
   /**
    * Returns volume of ellipsoid.
    *
    * @return totalVolume of ellipsoid.
    */
   public double totalVolume() {
      
      double total = 0;
      for (Ellipsoid e : eList) {
         if (e != null) {
            total += (e.volume());
         }
      }
      return total;
   }
   
   /**
    * Return total surface area.
    *
    * @return totalSurfaceArea of ellipsoid.
    */
   public double totalSurfaceArea() {
    
      double total = 0;
      for (Ellipsoid e : eList) {
         if (e != null) {
            total += (e.surfaceArea());
         }
      }
      return total;
   }
   
   /**
    * Returns average volume of ellipsoids.
    *
    * @return average volume of ellipsoids.
    */
   public double averageVolume() {
      if (this.numberOfEllipsoids() == 0) {
         return 0;
      }
      else {
         return this.totalVolume() / this.numberOfEllipsoids();
      }
   }
   
    /**
    * Returns surface area.
    *
    * @return averageSurfaceArea of ellipsoid
    */
   public double averageSurfaceArea() {
   
      if (this.numberOfEllipsoids() == 0) {
         return 0;
      }
      else {
         return this.totalSurfaceArea() / this.numberOfEllipsoids();   
      }   
   }
   
   /**
    * Returns string total output.
    *
    * @return totalOutput of ellipsoid list
    */
   public String toString() {
      String result = getName() + "\n";
      int index = 0;
      while (index < eList.size()) {
         result += "\n" + eList.get(index) + "\n";
         index++;
      }
      return result;
   }
   /**
    * String summaryInfo.
    *
    * @return result for string summary
    */
   public String summaryInfo() {
   
      DecimalFormat decFt = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "\n";
      result += "----- Summary for " + getName() + " -----";
      result += "/nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      result += "/nTotal Volume: " + decFt.format(totalVolume()) 
            + " cubic units";
      result += "/nTotal Surface Area: " + decFt.format(totalSurfaceArea()) 
            + " square units";
      result += "/nAverage Volume: " + decFt.format(averageVolume()) 
            + " cubic units";
      result += "/nAverage Surface Area: " 
         + decFt.format(averageSurfaceArea()) + " square units";
      return result;
   }
   /**
    * ArrayList for ellipsoid.
    *
    * @return EllipsoidList
    */   
   public ArrayList<Ellipsoid> getList() {
      return eList;
   }
   
   
   //******************Begin New Methods*******************************
   
   /**
    * EllipsoidList method to read in file.
    * @param fileNameIn to read in file name.
    * @return eL ellipsoid list
    * @throws FileNotFoundException when file not found.
    */
   public EllipsoidList readFile(String fileNameIn)
                                    throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      String eListName = "";
      double axisa = 0, axisb = 0, axisc = 0;
      
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         axisa = Double.parseDouble(scanFile.next());
         axisb = Double.parseDouble(scanFile.next());
         axisc = Double.parseDouble(scanFile.next());
         Ellipsoid e = new Ellipsoid("", axisa, axisb, axisc);
         myList.add(e);
      }
      
      EllipsoidList eL = new EllipsoidList(listName, myList);
      
      return eL;
   }
   /**
    * Method for adding an ellipsoid.
    * @param aIn for a input
    * @param bIn for b input
    * @param cIn for c input
    * @param label for label input
    */
   public void addEllipsoid(double label, double aIn, double bIn, double cIn) {
      Ellipsoid e = new Ellipsoid("", aIn, bIn, cIn);
      
      eList.add(e);
   }
  
  // public findEllipsoid( {
      
  // }
   /**
    * Method for deleting an ellipsoid.
    *
    * @param aIn for a input
    * @param bIn for b input
    * @param cIn for c input
    * @return result of deleted ellipsoid
    */
   public boolean deleteEllipsoid(double aIn, double bIn, double cIn) {
      
      boolean result = false;
      int index = -1;
      for (Ellipsoid e : eList) {
         if (e.getA() == aIn
            && e.getB() == bIn
            && e.getC() == cIn) {
            index = eList.indexOf(e);
            break;
         }
      }
       
      if (index >= 0) {
         eList.remove(index);
         result = true;
      }
      return result;
   }
}