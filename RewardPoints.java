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
    	System.out.println("You have earned:");

    	// Program assumes that you must spend at least 0.01 to qualify for points.

    	// Also assumed that each band of points is from the bottom, to just below the upper threshold.

    	if (0 < money && money < 100) {
    		System.out.println("100 points.");
    	}
    	else if (100 <= money && money < 250) {
    		System.out.println("250 points.");
    	}
    	else if (250 <= money && money < 500) {
    		System.out.println("500 points.");
    	}
    	else if (500 <= money && money < 1000) {
    		System.out.println("1000 points.");
    	}
    	else if (1000 <= money) {
    		System.out.println("1500 points.");
    	}
    	else {
    		System.out.println("0 points.");
    	}
    }
}