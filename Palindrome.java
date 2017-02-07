/*
 * Name: Niall Curtis
 * Student number: C1623580
 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter Word:");
    	String str = input.nextLine();
    	str = str.toLowerCase();
    	// Changes String to all lowercase so it matches reverse and backwards
    	
    	StringBuilder builder = new StringBuilder(str);
    	// StringBuilder allows easy reversing of string

    	if(str.equals(builder.reverse().toString())) {
    	/*  str.equals is a function to compare the str to its StringBuilder reversed version.

			StringBuilder reversed string needs to be converted back to normal string, with .toString().

			The .equals returns true if equal, which allows the if statement to be completed.
    	*/
    		System.out.println(str + " is a palindrome.");
    	}
    	else {
    		System.out.println(str + " is not a palindrome.");
    	}
    }
}