import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** SharedCloud test class. */
public class SharedCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test method for getAndSetDataStoredTest. **/
   @Test public void getAndSetDataStoredTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      Assert.assertEquals("get data stored failed", 12.000,
         c2.getDataStored(), .0001);
      c2.setDataStored(42.00);
      Assert.assertEquals("set data stored failed", 42.00,
         c2.getDataStored(), .0001);
   }
   /** Test method for getAndSetDataLimitTest. */
   @Test public void getandSetDataLimitTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      Assert.assertEquals("get data limit failed", 12.000,
         c2.getDataStored(), .0001);
      c2.setDataStored(42.00);
      Assert.assertEquals("set data limit failed", 42.00,
         c2.getDataStored(), .0001);
   }
   /** Test method for getCostFactorTest. */
   @Test public void getCostFactorTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      Assert.assertEquals("get cost factor failed", 1.0, 
         c2.getCostFactor(), .0001);
   }
   /** Test method for dataOverageTest. */
   @Test public void dataOverageTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      Assert.assertEquals("data overage failed", 0.000, 
         c2.dataOverage(), .0001);
      SharedCloud c3 = new SharedCloud("Cloud Three", 9.00, 25.0, 20.0);
      Assert.assertEquals("data overage failed", 5.000, 
         c3.dataOverage(), .0001);
   }
   /** Test method for monthlyCost. */
   @Test public void monthlyCostTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      Assert.assertEquals("monthly cost failed", 9.00, c2.monthlyCost(), .0001);
   }
   /** Test method for toString. */
   @Test public void toStringTest() {
      SharedCloud c2 = new SharedCloud("Cloud Two", 9.00, 12.0, 20.0);
      Assert.assertTrue(c2.toString().contains("Cloud Two"));
      Assert.assertTrue(c2.toString().contains("(class SharedCloud)"));
      Assert.assertTrue(c2.toString().contains("Monthly Cost: $9.00"));
      Assert.assertTrue(c2.toString().contains("Base Storage Cost: $9.00"));
      Assert.assertTrue(c2.toString().contains("Data Stored: 12.000 GB"));
      Assert.assertTrue(c2.toString().contains("Data Limit: 20.000 GB"));
      Assert.assertTrue(c2.toString().contains("Overage: 0.000 GB"));
      Assert.assertTrue(c2.toString().contains("Cost Factor: 1.0"));
   }
}
