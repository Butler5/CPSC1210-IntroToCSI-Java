import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Program for DedicatedCloudTest.
 *
 * Project_04 - DedicatedCloudTest.java
 * Adam Butler - CPSC 1220 - A01
 * 11-06-22
 */

public class DedicatedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getAndSetNameTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("get name failed", "Cloud One",
         c1.getName());
      c1.setName("Test");
      Assert.assertEquals("set name failed", "Test", 
         c1.getName());
   }
   /** Test method for getAndSetBaseStorageCostTest. */
   @Test public void getAndSetBaseStorageCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("get base storage cost failed", 40.00, 
         c1.getBaseStorageCost(), .001);
      c1.setBaseStorageCost(98.00);
      Assert.assertEquals("set base storage cost faild", 98.00, 
         c1.getBaseStorageCost(), .001);
   }
   /** Test method for getAndSetServerCostTest. */
   @Test public void getAndSetServerCostTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertEquals("set server cost failed", 42.00,
         c1.getServerCost(), .0001);
   }
   /** Test method for toStringTest. */
   @Test public void toStringTest() {
      DedicatedCloud c1 = new DedicatedCloud("Cloud One", 40.00, 10.00);
      Assert.assertTrue(c1.toString().contains("Cloud One"));
      Assert.assertTrue(c1.toString().contains("(class DedicatedCloud)"));
      Assert.assertTrue(c1.toString().contains("Monthly Cost: $50.00"));
      Assert.assertTrue(c1.toString().contains("Base Storage Cost: $40.00"));
      Assert.assertTrue(c1.toString().contains("Server Cost: $10.00"));
   }
}
