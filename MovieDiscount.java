/*
 /*
 * Programmer: Carter Van Bommel
 * Date: October 5, 2020
 * Purpose: Calculates the cost of a ticket
 */
 
// Imports Scanner
import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
    	
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        
        // Defines ticketCost as 14.50
        double ticketCost = 14.50;
        
        
        // Ask the user for the their age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        
        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean hasCoupon = input.nextBoolean();

        
        // If the user is in this age range, lower price by $3
        if (age >= 13 || age <= 65) {
        	ticketCost -= 3;	
        	System.err.println(ticketCost);
        }
        
        // If the user has a ticket, lower price by $2
        if (hasCoupon = true) {
        	ticketCost -= 2;
        	System.err.println(ticketCost);
        }
        
        
        // Print the cost of a movie ticket
        System.out.println("Your ticket costs $" + ticketCost + "."); 
        
        
        input.close();
        
    }
}
