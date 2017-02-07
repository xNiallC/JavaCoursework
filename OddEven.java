/*
 * Name: Niall Curtis
 * Student number: C1623580
 */
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int sumEven = 0;
    	int sumOdd = 0;
        // Create empty variables for the sums.

    	System.out.println("Enter 5 Numbers:");
    	for(int i = 0; i < 5; i++) {
            // For loop to take each input.

    		int number = input.nextInt();

            // Every even number is divisible by 2, so anything that has % 2 equal to 0. Anything else is odd.
            // Adds to the empty variables depending on the answer.

    		if(number % 2 == 0) {
    			sumEven += number;
    		}
    		else {
    			sumOdd += number;
    		}
    	}
    	System.out.println("Total of Odd Numbers = " + sumOdd);
    	System.out.println("Total of Even Numbers = " + sumEven);
    }
}