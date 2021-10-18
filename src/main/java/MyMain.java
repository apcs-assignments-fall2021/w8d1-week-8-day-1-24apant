import java.util.Arrays;
import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        return (int) (Math.random() * (11)) + 10;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static int findMaxInt(int[] arr){
        int maxInt = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j >= maxInt) {
                maxInt = j;
            }
        }
        return maxInt;
    }
    public static int findMinInt(int[] arr){
        int maxInt = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j <= maxInt) {
                maxInt = j;
            }
        }
        return maxInt;
    }
    public static void main(String[] args) {
        // YOUR CODE HERE FOR WARMUP
        int[] arr = new int[3];
        for (int i = 0; i < 3;  i++) {
            arr[i] = randomTeen();
        }

        System.out.println("The three random numbers are " + arr[0] + ", " + arr[1] + ", and " + arr[2]);
        System.out.println("The largest number is " + findMaxInt(arr));
        System.out.println("The smallest number is " + findMinInt(arr));


         //Uncomment this code later!
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1, 2, 7)); // 2
        System.out.println(Mathey.max(3.7, 21.7, 9.123, 4.32)); // 2
        System.out.println("The c value for a right triangle with a = 5 and b = 12 is " + (int) Mathey.sqrt((Mathey.pow(5, 2)) + Mathey.pow(12, 2)));
    }

}


