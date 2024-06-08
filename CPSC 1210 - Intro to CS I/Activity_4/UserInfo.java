/**
 * Program for inputing user info.
 *
 * Activity_04 - UserInfo.Java
 * Adam Butler - CPSC 1210 - A01
 * 09-08-22
 */
public class UserInfo {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   /** Constructor.
    *
    * @param firstNameIn to determine firstname. 
    * @param lastNameIn to determine lastname.
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   /**
    * Methods for public string.
    *
    * @return present.
    */
   public String toString() {
   
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      
      return output;
   }
   
   /**
    * Location.
    * 
    * @param locationIn to set location. 
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * Age.
    *
    * @param ageIn to set age. 
    * @return to return if false.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * Age.
    *
    * @return to return age. 
    */
   public int getAge() {
      return age;
   }
   
   /**
    * Location.
    *
    * @return to return location.
    **/
   public String getLocation() {
      return location;
   }
   /**
    * Log off.
    */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
    * Log on.
    */
   public void logOn() {
      status = ONLINE;
   }
}