/**
 * Program for Comparable Interface.
 *
 * Activity_02 - Customer.java
 * Adam Butler- CPSC 1220 - A01
 * 10-20-22
 */
public class Customer implements Comparable<Customer> {
   
   private String name;
   private String location;
   private double balance;
   /**
    * Constructor. 
    *
    * @param nameIn for customer name
    */
   public Customer(String nameIn) {
      
      name = nameIn;
      location = "";
      balance = 0;
      
   }
   /**
    * Method for setting location.
    *
    * @param locationIn for location
    */
   public void setLocation(String locationIn) {
      
      location = locationIn;
   }
   /**
    * Method for changeBalance.
    *
    * @param amount for balance amount
    */
   public void changeBalance(double amount) {
      
      balance += amount;
   }
   /**
    * Method for getLocation.
    *
    * @return location
    */
   public String getLocation() {
      
      return location;
   }
   /**
    * Method for getBalance.
    *
    * @return balance
    */
   public double getBalance() {
      
      return balance;
   }
   /**
    * Method for setLocation.
    *
    * @param city for city
    * @param state for state
    */
   public void setLocation(String city, String state) {
      
      location = city + ", " + state;
   }
   /**
    * Method for to string.
    *
    * @return name 
    */
   
   public String toString() {
      
      return (name + "\n" + location 
         + "\n$" + balance);
   }
   /**
    * Method for compareTo.
    *
    * @param obj for customer obj
    * @return 0
    */
   public int compareTo(Customer obj) {
      
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
}