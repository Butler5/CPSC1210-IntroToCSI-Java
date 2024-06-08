import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** PublicCloud Test class. */
public class PublicCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test method for getCostFactor. **/
   @Test public void getCostFactorTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      Assert.assertEquals("get cost factor failed", 2.0,
         c4.getCostFactor(), .0001);
   }
   /** Test method for monthlyCostTest. */
   @Test public void monthlyCostTest() {
      PublicCloud c4 = new PublicCloud("Cloud Four", 9.00, 25.0, 20.0);
      Assert.assertEquals("monthly cost failed", 19.00, 
         c4.monthlyCost(), .0001);
   }
}
