import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Test method for SpherocylinderListTest. */
public class SpherocylinderListTest {

   private static final double DELTA = .0001;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test getName. **/
   @Test public void getNameTest() {
      Spherocylinder sc1 = new Spherocylinder("sc1", 0.5, 0.25);
      Spherocylinder sc2 = new Spherocylinder("sc2", 0.5, 0.25);
      Spherocylinder sc3 = new Spherocylinder("sc3", 0.5, 0.25);
      Spherocylinder[] spc = new Spherocylinder[3];
      spc[0] = sc1;
      spc[1] = sc2;
      spc[2] = sc3;
      SpherocylinderList test1 = new SpherocylinderList("Test List", spc, 3);
      Assert.assertEquals("Test List", test1.getName());
   }
   /** Test method for numberOfSpherocylinderTest. */
   @Test public void numberOfSpherocylindersTest() {
      Spherocylinder sc1 = new Spherocylinder("sc1", 0.5, 0.25);
      Spherocylinder sc2 = new Spherocylinder("sc2", 10.8, 10.1);
      Spherocylinder sc3 = new Spherocylinder("sc3", 3.5, 4.0);
      Spherocylinder[] spc = new Spherocylinder[3];
      spc[0] = sc1;
      spc[1] = sc2;
      spc[2] = sc3;
      SpherocylinderList test1 = new SpherocylinderList("Test List", spc, 3);
      Assert.assertEquals(3, test1.numberOfSpherocylinders());
   }
   /** Test method for surfaceAreaTest. */
   @Test public void surfaceAreaTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(3.927, example1.surfaceArea(), DELTA);
   }
   /** Test method for surfaceAreaTest. */
   @Test public void volumeTest() { 
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0.72, example1.volume(), DELTA);
   }
   /** Test method for averageSurfaceAreaTest. */
   @Test public void averageSurfaceAreaTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(3.927, example1.surfaceArea(), DELTA);
   }
   /** Test method for averageVolume. */ 
   @Test public void averageVolume() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals(0.72, example1.volume(), DELTA);
   }
   /** Test method for toStringTest. */
   @Test public void toStringTest() {
      Spherocylinder example1 = new Spherocylinder("Small Example", 0.5, 0.25);
      String toString = example1.toString();
      Assert.assertTrue(toString.contains("Small Example"));
   }
   /** Test method for addSpherocylinder.*/
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
      bob.addSpherocylinder("Jane", 2.3, 4.5);
      Assert.assertEquals(1, bob.numberOfSpherocylinders(), .0001);
   
   }
   /** Test method for deleteSpherocylinderTrueTest. */
   @Test public void deleteSpherocylinderTrueTest() {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
      Spherocylinder g = new Spherocylinder("Bob", 0, 0);
      g = bob.deleteSpherocylinder("Small Example");
      Assert.assertEquals(0, bob.numberOfSpherocylinders());
   }
   /** Test method for deleteSphereocylinderFalseTest. */
   @Test public void deleteSphereocylinderFalseTest() {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList bob = new SpherocylinderList("bob", a, 0);
      Spherocylinder g = new Spherocylinder("bob", 0, 0);
      g = bob.deleteSpherocylinder("bob");
      Assert.assertEquals(0, bob.numberOfSpherocylinders());
   }
   /** Test method for findSpherocylinder. */
   @Test public void findSpherocylinderTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 2.5)};
      SpherocylinderList bob = new SpherocylinderList("bob", a, 1);
      Spherocylinder yes = bob.findSpherocylinder("Cate");
      Assert.assertEquals(a[0], yes);
   }
   /** Test method for findSpherocylinderTest. */
   @Test public void findSpherocylinderFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("late", 2.4, 2.5)};
      SpherocylinderList bob = new SpherocylinderList("bob", a, 1);
      Spherocylinder yes = bob.findSpherocylinder("Cate");
      Assert.assertEquals(null, yes);
   }
   /** Test method for editSpherocylinderTest. */
   @Test public void editSpherocyinderTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 2.5)};
      SpherocylinderList bob = new SpherocylinderList("bob", a, 1);
      boolean yes = false;
      yes = bob.editSpherocylinder("Cate", 1.5, 7.4);
      Assert.assertTrue(yes);
   }
   /** Test method for editSpherocylinderTest. */
   @Test public void editSpherocylinderFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 2.5)};
      SpherocylinderList bob = new SpherocylinderList("bob", a, 1);
      boolean yes = false;
      yes = bob.editSpherocylinder("late", 1.5, 7.4);
      Assert.assertFalse(yes);
   }
   /** Test method for findSpherocylinderWithLargestVolume. */
   @Test public void findSpherocylinderWithLargestVolumeTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 1.5),
         new Spherocylinder("Sam", 7.4, 3.5)};
      SpherocylinderList bob = new SpherocylinderList("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(a[1], yes);
   }
   /** Test method for findSpherocylidnerWithLargestVolume. */
   @Test public void findSpherocylinderWithLargestVolumeFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 7.6, 6.9), 
         new Spherocylinder("sam", 2.1, 1.2)};
      SpherocylinderList bob = new SpherocylinderList("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(a[0], yes);
   }
}
