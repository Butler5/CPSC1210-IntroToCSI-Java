/**
 * Program for SpherocylinderList.
 *
 * Project_03 - SpherocylinderList.java
 * Adam Butler - CPSC 1220 - A01
 * 10-30-22
 */
public class SpherocylinderList {
   
   private String listName = "";
   private Spherocylinder[] objects;
   private int num = 0;
   /**
    * Constructor for SphercylinderList.
    *
    * @param nameIn for name in
    * @param objIn for object in
    * @param numIn for number in 
    */
   public SpherocylinderList(String nameIn, Spherocylinder[] objIn, int numIn) {
      listName = nameIn;
      objects = objIn;
      num = numIn;
   } 
   /**
    * Method for getName.
    *
    * @return listName
    */
   public String getName() {
      return listName;
   }
   /**
    * Method for numberOfSpherocylinders.
    *
    * @return num
    */
   public int numberOfSpherocylinders() {
      return num;
   }
   /**
    * Program for totalSurfaceArea.
    *
    * @return surfaceArea
    */
   
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < num) {
         surfaceArea += objects[i].surfaceArea();
         i++;
      }
      return surfaceArea;
   }
   /**
    * Method for totalVolume.
    *
    * @return volume
    */
   public double totalVolume() {
      double volume = 0;
      int i = 0;
      while (i < num) {
         volume += objects[i].volume();
         i++;
      }
      return volume;
   }
   /**
    * Method for averageSurfaceArea.
    *
    * @return surfaceArea
    */
    
   public double averageSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < num) {
         surfaceArea += objects[i].surfaceArea();
         i++;
      }
      if (num > 0) {
         surfaceArea /= num;
      }
      return surfaceArea;
   }
    /**
     * Method for averageVolume.
     *
     * @return volume
     */
   public double averageVolume() {
      double volume = 0;
      int i = 0;
      while (i < num) {
         volume += objects[i].volume();
         i++;
      }
      if (num > 0) {
         volume /= num;
      }
      return volume;
   }
    /**
     * Method for toString.
     *
     * @return output
     */
   public String toString() {
      String output = listName + "\n";
      int i = 0;
      while (i < num) {
         output += "\n" + objects[i] + "\n";
         i++;
      }
      return output;
   }
    /**
     * Method for getList.
     *
     * @return objects
     */
   public Spherocylinder[] getList() {
      return objects;
   }
    /**
     * Method for addSpherocylinder.
     * 
     * @param labelIn for label in
     * @param radiusIn for radius in
     * @param cylHeightIn for cylinder height in
     */
   public void addSpherocylinder(String labelIn, 
      double radiusIn, double cylHeightIn) {
      Spherocylinder s = new Spherocylinder(labelIn, radiusIn, cylHeightIn);
      objects[num] = s;
      num++;
   }
    /**
     * Method for findSpherocylinder.
     *
     * @return bob
     * @param labelIn for label input
     */
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder bob = new Spherocylinder("", 0, 0);
      boolean find = false;
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            bob = objects[i];
            find = true;
         }
      }
      if (find) {
         return bob;
      }
      else {
         return null;
      }
      
   }
    /**
     * Method for deleteSpherocylinder.
     *
     * @return bob  
     * @param labelIn for label in
     */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder bob = findSpherocylinder(labelIn);
      
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            bob = objects[i];
            for (int j = i; j < num - 1; j++) {
               objects[j] = objects[j + 1];
            }
            objects[num - 1] = null;
            num--;
            break;
         }
      }
      return bob;
   } 
   /**
    * Method for editSpherocylinder.
    *
    * @return here
    * @param labelIn for label input
    * @param radiusIn for radius input
    * @param cylHeightIn for cylinder height input
    */
   public boolean editSpherocylinder(String labelIn, 
      double radiusIn, double cylHeightIn) {
      boolean here = false;
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            objects[i].setRadius(radiusIn);
            objects[i].setCylinderHeight(cylHeightIn);
            here = true;
         }
      } 
      return here;
   }
    /** 
     * Method for findSpherocylinderWithLargestVolume.
     *
     * @return large
     */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      if (num > 0) {
         Spherocylinder large = objects[0];
         
         for (int i = 0; i < num; i++) {
            if (objects[i].volume() > large.volume()) {
               large = objects[i];
            }
         }
         return large;
      }
      else {
         return null;
      }
   }
}