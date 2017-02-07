/*
 * Name: Niall Curtis
 * Student number: C1623580
 */
import java.util.Scanner;
import java.util.Arrays;

public class NameSort {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please Enter 3 Names:");

    	String name1 = input.nextLine();
    	String name2 = input.nextLine();
    	String name3 = input.nextLine();
        // Take 3 inputs as strings.

    	System.out.println("");

    	String[] listNames = {name1, name2, name3};
        // Create array from the names.

    	Arrays.sort(listNames);
        // Simple array function to sort alphabetically.

    	for(int i = 0; i < listNames.length; i++) {
            // Loop to print them all out.
    		System.out.println(listNames[i]);
    	}
    }
}