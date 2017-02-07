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
    	System.out.println("");
    	String[] listNames = {name1, name2, name3};
    	Arrays.sort(listNames);
    	for(int i = 0; i < listNames.length; i++) {
    		System.out.println(listNames[i]);
    	}
    }
}