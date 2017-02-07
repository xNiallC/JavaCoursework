/*
 * Name: 
 * Student number: 
 */

//RandomCounter.java
// Application to generate and add up 10 random integer values between 0 and 100. As each random number is generated, it is printed to the screen. Finally the sum of the generated numbers is output. An example of a correctly formatted output is:

//86 44 77 65 73 81 86 95 72 28

//Sum of the 10 random numbers is 707


public class RandomCounter {

    public static void main(String[] args) {

        int randomCount = 0;
        
        for(int i = 0; i < ; ++i) {
            int randNum = Math.random();
            System.out.print(randNum + " ");
            randomCount += randNum;
        }
    
        System.out.println("Sum of the 10 random numbers is" + randomNum);

    }    
}