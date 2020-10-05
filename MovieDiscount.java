/*
 /* Programmer: Gryphen Clark
 * Date: September 25th 2020
 * Purpose: To make a program that allows to discount users on their age and if they have a coupon.
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their age 
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon. This would read in a true or false statement.
        System.err.print("Do you have a coupon? [true/false] ");
        boolean hasCoupon = input.nextBoolean();
        
        // Print the cost of a movie ticket
        if (age <= 12 || age >= 65) {
        	if(hasCoupon == true) {
        		System.out.println("Your ticket costs $9.5.");
        	}
        	else {
        		System.out.println("Your ticket costs $11.5.");
        	}
        }
        else if(hasCoupon == true) {
    			System.out.println("Your ticket costs $12.5.");
        }	
        else {
        	System.out.println("Your ticket costs $14.5.");
        }
    }
}
