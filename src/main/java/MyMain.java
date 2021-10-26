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

        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(3.7, 4.32)); // 4.32
        System.out.println(Mathey.max(1, 2, 7)); // 7
        System.out.println(Mathey.max(1.66, 12.1, 79.4, 33.12)); // 79.4
        System.out.println(Mathey.randomInt(1, 10)); // Random int between 1 and 10 inclusive
        System.out.println(Mathey.randomInt(100)); // Random int between 0 and 100 inclusive
        System.out.println(Mathey.pow(3, 3)); // 27
        System.out.println(Mathey.abs(-22)); // 22
        System.out.println(Mathey.abs(14)); // 14
        System.out.println(Mathey.round(3.4999999999)); // 3
        System.out.println(Mathey.floor(3.999182398043)); // 3
        System.out.println(Mathey.ceil(3.999999999999)); // 4

    }

}


