import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Program for SpherocylinderTest.
 *
 * Project_03 - SpherocylinderTest.java
 * Adam Butler - CPSC 1220 - A01
 * 10-23-22
 */

public class SpherocylinderTest {

   private static final double DELTA = .001;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method for getLabel. */
   @Test public void getLabelTest() {
      Spherocylinder bob = new Spherocylinder("bob", 2.3, 1.2);
      String label = bob.getLabel();
      Assert.assertEquals("bob", label);
   }
   /** Test method for setLabel true. */
   @Test public void setLabelTrueTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      boolean yes = false;
      String label = "Jane";
      yes = bob.setLabel(label);
      Assert.assertEquals(bob.getLabel(), label);
      Assert.assertTrue(yes);
   }
   /** Test method for setLabel false. */
   @Test public void setLabelFalseTest() {
      Spherocylinder bob = new Spherocylinder("bob", 2.3, 1.2);
      boolean yes = bob.setLabel(null);
      Assert.assertFalse(yes);
   }
   /** Test method for getRadius. */
   @Test public void getRadiusTest() {
      Spherocylinder bob = new Spherocylinder("bob", 2.3, 1.2);
      double radius = bob.getRadius();
      Assert.assertEquals(2.3, radius, DELTA);
   }
   /** Test method for getCylinderHeight. */
   @Test public void getCylinderHeightTest() {
      Spherocylinder bob = new Spherocylinder("bob", 2.3, 1.2);
      double cylHeight = bob.getCylinderHeight();
      Assert.assertEquals(1.2, cylHeight, DELTA);
   }
   
   /** Test method for spherocylinderTest. **/
   @Test public void spherocylinderTest() {
   
      Spherocylinder example1 = new Spherocylinder("Small Example",
          0.5, 0.25);
      
      Assert.assertEquals("For spherocylinder \"Small Example\", radius 0.5" 
            + ", cylinder height o.25, is a spherocylinder", true, true);
   }
   /**
    * Test method for circumference.
    */
   @Test public void circumferenceTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(3.142, example1.circumference(), DELTA);
   }
   /** Test method for surface area. **/
   @Test public void surfaceAreaTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(3.927, example1.surfaceArea(), DELTA);
   }
   /** Test method for volume. **/
   @Test public void volumeTest() { 
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0.72, example1.volume(), DELTA);
   }
      /** Test method for count. **/
   @Test public void countTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder.resetCount();
      Spherocylinder example2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(1, example2.getCount());
   }
   /** Test method for equals. **/
   @Test public void equalsTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(true, example1.equals(example2));
   }
   /** Test method for string toString. **/
   @Test public void toStringTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      String toString = example1.toString();
      Assert.assertTrue(toString.contains("Small Example"));
   }
   /** Test method for hashCode. **/
   @Test public void hashCodeTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0, example1.hashCode());
   }
   /** Test method for resetCount. **/
   @Test public void resetCountTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      example1.resetCount();
      Assert.assertEquals(0, example1.getCount());
   }
   /** Test method for compareTo. **/
   @Test public void compareToTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder example3 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("", 0, example1.compareTo(example3));
      Assert.assertEquals("", -1, example1.compareTo(example2));
      Assert.assertEquals("", 1, example2.compareTo(example1));
   }
   /** Test method for setLabel. */
   @Test public void setLabelTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue("", example1.setLabel("Medium Example"));
      Assert.assertTrue("", example1.getLabel().contains("Medium Example"));
      Assert.assertFalse("", example1.setLabel(null)); 
   }
   /** Test method for setRadius. */
   @Test public void setRadiusTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue("", example1.setRadius(0.1));
      Assert.assertTrue("", example1.setRadius(0));
      Assert.assertFalse("", example1.setRadius(-0.1));
      Assert.assertEquals("", 0, example1.getRadius(), .000001);
   }
   /** Test method for setCylinderHeight.*/
   @Test public void setCylinderHeightTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertTrue("", example1.setCylinderHeight(0.1));
      Assert.assertTrue("", example1.setCylinderHeight(0));
      Assert.assertFalse("", example1.setCylinderHeight(-0.1));
      Assert.assertEquals("", 0, example1.getCylinderHeight(), .000001);
   }
   /** Test method for getCountTest. */
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder example2 = 
         new Spherocylinder("Medium Example", 10.8, 10.1);
      Assert.assertEquals("", 2, example1.getCount());
   }
}
