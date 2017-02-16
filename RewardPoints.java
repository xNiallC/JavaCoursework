/*
 * Name: Niall Curtis
 * Student number: C1623580
 */
import java.util.Scanner;

public class RewardPoints {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please Input This Month's Spending:");
    	float money = input.nextFloat();
    	System.out.print("You have earned: ");

    	// Program assumes that you must spend at least 0.01 to qualify for points.

    	// Also assumed that each band of points is from the bottom, to just below the upper threshold.

    	if (0 < money && money < 100) {
    		System.out.print("100 points.\n");
    	}
    	else if (100 <= money && money < 250) {
    		System.out.print("250 points.\n");
    	}
    	else if (250 <= money && money < 500) {
    		System.out.print("500 points.\n");
    	}
    	else if (500 <= money && money < 1000) {
    		System.out.print("1000 points.\n");
    	}
    	else if (1000 <= money) {
    		System.out.print("1500 points.\n");
    	}
    	else {
    		System.out.print("0 points.\n");
    	}
    }
}