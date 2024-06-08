import java.text.DecimalFormat;
/**
 * Program for Ellipsoid.
 *
 * Project_06 - Ellipsoid.java
 * Adam Butler - CPSC 1210 - A01
 * 09-24-22
 */
public class Ellipsoid {
   // Fields - Instance variables.
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;
   
   /**
    * Constructor.
    * @param labelIn establishes label.
    * @param aIn establishes a axis.
    * @param bIn establishes b axis.
    * @param cIn establishes c axis. 
    */
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   }
   
   /**
    * Method for String getLabel.
    * @return string getLabel.
    */
   public String getLabel() {
      return label;
   }
   /**
    * Method for boolean setLabel.
    * @param labelIn retrieves a label.
    * @return true or false.
    */
   public boolean setLabel(String labelIn) {
      
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * Method for double getA.
    * @return getA.
    */
   public double getA() {
     
      return a;
   }
   /**
    * Method for boolean.
    * @param aIn returns a boolean.
    * @return setA.
    */
   public boolean setA(double aIn) {
   
      if (aIn > 0) {
         a = aIn;
         return true; 
      }
      else {
         return false;
      } 
   }
   /** 
    * Method for double getB.
    * @return getB.
    */
   public double getB() {
    
      return b;
   }
   /**
    * Method for boolean setB.
    * @param bIn this returns a boolean. 
    * @return setB.
    */
   public boolean setB(double bIn) {
   
      if (bIn > 0) {
         b = bIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * Method getC. 
    * @return getC
    */
   public double getC() {
   
      return c;
   }
   /**
    * Method for boolean setC.
    * @param cIn this returns boolean.
    * @return setC.
    */
   public boolean setC(double cIn) {
   
      if (cIn > 0) {
         c = cIn;
         return true;
      }
      else {
      
         return false;
      }
   }  
   /**
    * Method for double volume.
    * @return volume.
    */
   public double volume() {
      
      return ((4 * Math.PI * a * b * c) / 3);
      
   }
   /**
    * Method for surfaceArea.
    * @return surface area. 
    */
   public double surfaceArea() {
   
      double surfaceArea = (4 * Math.PI * (Math.pow((((Math.pow((a * b), 1.6)) 
         + Math.pow((a * c), 1.6) + Math.pow((b * c), 1.6)) / 3), .625)));
      return surfaceArea;
   }
   /** 
    * Method for String toString.
    * @return output.
    */
  
   public String toString() {
   
      DecimalFormat df1 = new DecimalFormat("#,##0.0###");
      String output = "Ellipsoid \"" + label + "\" with axes a = " 
         + df1.format(a) +  ", b = " + df1.format(b) 
         + ", c = " + df1.format(c) + " units has:\n\tvolume = " 
         + df1.format(volume()) + " cubic units" 
         + "\n\tsurface area = " + df1.format(surfaceArea()) + " square units"; 
      return output;
   }
}