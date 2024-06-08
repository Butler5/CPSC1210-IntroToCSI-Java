import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** PersonalCloudTest class. */
public class PersonalCloudTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test method for getCostFactor. **/
   @Test public void getCostFactorTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      Assert.assertEquals("get cost factor failed", 3.0,
         c5.getCostFactor(), .0001);
   }
   /** Test method for monthlyCost. */
   @Test public void monthlyCostTest() {
      PersonalCloud c5 = new PersonalCloud("Cloud Five", 9.00, 21.0, 20.0);
      Assert.assertEquals("monthly cost failed", 12.00, 
         c5.monthlyCost(), .0001);
   }
}
