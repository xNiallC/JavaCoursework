/*
 * Name: Niall Curtis
 * Student number: C1623580
 */
import java.util.Scanner;


// Basic input parser to be used in other applications in the coursework.


public class NameInput {
    public static String getString() {
        Scanner input = new Scanner(System.in);
        boolean inputError = true; 
        String initialString = "";

        while (inputError) {
            String newString = input.nextLine();

            boolean isString = newString.matches("\\d+");

            if (isString == false) {
                initialString += newString;
                inputError = false;
            }
            else {
                System.out.println("Invalid Input Entered.");         
            }
        }
        return initialString;
    }
}