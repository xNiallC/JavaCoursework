/*
 * Name: Niall Curtis
 * Student number: C1623580
 */
import java.util.Arrays;
import java.util.InputMismatchException;

public class NameSort {
    public static void main(String[] args) {
        NameInput input = new NameInput();

    	System.out.println("Please Enter 3 Names:");

    	String name1 = input.getString();
    	String name2 = input.getString();
    	String name3 = input.getString();
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