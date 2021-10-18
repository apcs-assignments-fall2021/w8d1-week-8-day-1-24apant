public class Mathey {
    /* Write your own version of the Math.max method
     * Your method should be called max
     * This method should take **two integers** and return the larger integer
     * Ex. max(1, 2) => 2

     * You will need to practice writing the method signature below!
     * public static ...
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

    public static int max(int a, int b){
        if (a > b || a == b){
            return  a;
        }
        else{
            return b;
        }
    }


    /* Write another method called max that takes **two doubles**
     * Ex. max(1.5, 4.0) => 4.0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED

    public static double max(double a, double b){
        if (a > b || a == b){
            return a;
        }
        else{
            return b;
        }
    }


    /* Write another method called max that takes **three integers**
     * Ex. max(1, 4, 2) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int max(int d, int b, int c){
        int a = Math.max(d, c);
        if (a > b || a == b){
            return  a;
        }
        else{
            return b;
        }
    }



    /* Write another method called max that takes **four doubles**
     * Ex. max(1.0, 4.25, 2.1) => 4.25
     */
    public static double max(double a, double b, double f, double e){
        double d = Math.max(a, b);
        double c = Math.max(e, f);
        if(d > c || d == c){
            return d;
        }
        else{
            return c;
        }
    }
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED




    /* Write a method that takes **two integers** and generates a random
     * integer between the first integer and the second integer, inclusive
     * you may assume that the first integer is smaller than the second
     * Ex. randomInteger(1, 4) => 3
     *     randomInteger(1, 4) => 2
     *     randomInteger(1, 4) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int randomInt(int a, int b) {
        return (int) (Math.random() * (b - a) + a);
    }



    /* Write a method that takes **one integer** and generates a random
     * integer between 0 and the integer, inclusive
     * you may assume that the integer is greater than 0
     * Ex. randomInteger(5) => 3
     *     randomInteger(5) => 5
     *     randomInteger(5) => 0
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int randomInt(int b) {
        return (int) (Math.random() * (b));
    }






    // YOU MAY WORK ON THE FOLLOWING METHODS IF YOU FINISH EARLY

    /* Write a method that takes **two integers** and calculates the exponent
     * that you get by raising the first integer to the second integer
     * you may assume that both integers are positive
     * Ex. pow(2, 5) => 32
     *     pow(3, 4) => 81
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int pow(int a, int b){
        int total = 1;
        for (int i = 0; i < b; i++) {
            total *= a;
        }
        return total;
    }



    /* Write a method that takes **one integer** and returns the
     * absolute value of that integer
     * Ex. abs(2) => 2
     *     abs(-2) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int abs(int a){
        if (a < 0){
            a -= (a * 2);
        }
        return a;
    }



    /* Write a method that takes **one double** and returns the
     * integer value that you get by rounding that double
     * You may assume that the integer is positive
     * Ex. round(2.4) => 2
     *     round(2.5) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int round(double a){
        return (int) (a + 0.5);
    }




    /* Write a method that takes **one double** and returns the
     * floor of that value
     * The floor is defined as the **largest** integer that is **less than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. floor(2.4) => 2
     *     floor(2.999999999999) => 2
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
    public static int floor(double b){
        return (int) b;
    }




    /* Write a method that takes **one double** and returns the
     * ceiling of that value
     * The ceiling is defined as the **smallest** integer that is **greater than**
     * or equal to some value
     * You may assume that the integer is positive
     * Ex. ceil(2.99999) => 3
     *     ceil(3.01) => 4
     */
    // YOUR CODE HERE, METHOD HEADER ALSO REQUIRED
     public static int ceil(double a){
         return (int) (a + (0.999999999999999));
     }




    /* Calculates the square root iteratively, using the Babylonian method
     * This method has been provided for you
     */
    public static double sqrt(double x) {
        double x1 = 5;
        double prev = 0;

        while (Math.abs(prev - x1) > 0.0001) {
            prev = x1;
            x1 = (x1 + x/x1) / 2;
        }

        return x1;
    }
}