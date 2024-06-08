import java.text.DecimalFormat;
/**
 * Program for Spherocylinder.
 *
 * Project_03 - Spherocylinder.java
 * Adam Butler - CPSC 1220 - A01
 * 10-23-22
 */
 
public class Spherocylinder implements Comparable<Spherocylinder> {

   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0; 
   private static int count = 0;
   /**
    * Constructor.
    *
    * @param labelIn for label
    * @param radiusIn for radius
    * @param cylinderHeightIn for cylinder height
    */
   public Spherocylinder(String labelIn, double radiusIn, 
      double cylinderHeightIn) {
      
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn); 
      count++;
   }  
   /**
    * Method for setLabel.
    *
    * @param labelIn for label
    * @return true or false
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
    * Method for getLabel.
    *
    * @return label
    */
   public String getLabel() {
      return label;
   }
   /**
    * Method for setRadius.
    * 
    * @param radiusIn for radius
    * @return true or false
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }  
   /**
    * Method for getRadius.
    *
    * @return radius
    */
   public double getRadius() {
      return radius;
   }
   /**
    * Method for setCylinderHeight.
    *
    * @param cylinderHeightIn for cylinder height
    * @return true or false
    */
   public boolean setCylinderHeight(double cylinderHeightIn) {
      
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * Method for getCylinderHeight.
    *
    * @return cylinderHeight
    */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   /** 
    * Method for circumference.
    * 
    * @return circumference
    */ 
   public double circumference() {
      double circumference = (2 * Math.PI * radius);
      return circumference;
   }
   /**
    * Method for surfaceArea.
    *
    * @return surfaceArea
    */
   public double surfaceArea() {
      double surfaceArea = ((2 * Math.PI * radius) * (2 * radius 
         + cylinderHeight));
      return surfaceArea;
   }
   /**
    * Method for volume.
    *
    * @return volume
    */
   public double volume() {
      double volume = 0;
      volume = (Math.PI * Math.pow(radius, 2) 
         * (4 * radius / 3 + cylinderHeight));
      return volume;
   }
   /**
    * Method for toString.
    * 
    * @return output 
    */
   public String toString() {
      
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius " 
         + df1.format(radius) + " and cylinder height " 
         + df1.format(cylinderHeight) 
         + " has:\n\tcircumference = " + df1.format(circumference())
         + " units\n\tsurface area = " + df1.format(surfaceArea()) 
         + " square units\n\tvolume = " + df1.format(volume()) + " cubic units";
      return output;
   }
   /**
    * Method for getCount.
    *
    * @return count
    */
   public static int getCount() {
      
      return count;
   }
   /**
    * Method for resetCount.
    *
    */
   public static void resetCount() {
      count = 0;
   }
   /**
    * Method for equals.
    *
    * @param obj for object
    * @return true or false
    */
   public boolean equals(Object obj) { 
    
      if (!(obj instanceof Spherocylinder)) { 
         return false; 
      } 
      else {  
         Spherocylinder d = (Spherocylinder) obj;        
         return (label.equalsIgnoreCase(d.getLabel()) 
                  && Math.abs(radius - d.getRadius()) < .000001    
                  && Math.abs(cylinderHeight - d.getCylinderHeight()) 
                        < .000001); 
      }  
   } 
   /**
    * Method for hashCode.
    * 
    * @return 0
    */ 
   public int hashCode() {
      return 0;
   }
   /**
    * Method for compareTo.
    *
    * @param other for other Spherocylinder
    * @return 0
    */
   public int compareTo(Spherocylinder other) {
      
      if (Math.abs(this.volume() - other.volume()) < 0.00001) {
         return 0;
      }
      else if (this.volume() < other.volume()) {
         return -1;
      }
      else  {
         return 1;
      } 
   }
}

