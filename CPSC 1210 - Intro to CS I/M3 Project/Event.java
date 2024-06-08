import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program for event information.
 *
 * M3 Project - Event.java
 * Adam Butler - CPSC 1210 - A01
 * 09-04-22
 */
public class Event {
   /**
    * Displays event information.
    *
    * @param args not used. 
    */
   public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);
      
      String input = "";
    
      System.out.print("Enter your event code: ");
      input = userInput.nextLine();
      
      int count = input.length();
      
      input.trim();
      
      String date = (input.substring(0, 1) + "/" + input.substring(1, 3) + "/" 
         + input.substring(3, 7));
         
      String time = (input.substring(7, 10) + ":" + input.substring(9, 12));
      
      String price = (input.substring(12, 16));
      
      DecimalFormat fmtprice = new DecimalFormat("$#,##0.00");
      double priceDouble = Double.parseDouble(price);
      
      String discount = (input.substring(17, 18));
      double discountDouble = Double.parseDouble(discount);
      DecimalFormat fmtdiscount = new DecimalFormat("0%");
      
      String section = (input.substring(18, 21));
      
      String row = (input.substring(22, 22));
      
      String seat = (input.substring(23, 24));
      
      String description = (input.substring(25, input.length()));
      
      if (input.length() < 26) {
      
         System.out.println("Invalid Event Code." 
            + "\nEvent code must have at least 26 characters.");
      
      }
      else {
      
         System.out.println("Event: " + description + "   Date: " 
            + date + "   Time: " + time + "\nSection: " + section
            + "   Row: " + row + "   Seat: " + seat + "\nPrice: " 
            + price + "   Discount: " + fmtdiscount.format(discount) 
            + "   Cost: ");
      
      } 
   }
}