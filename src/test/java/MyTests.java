// import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    public static void main(String[] args){
        System.out.println("Mathey.max tests");
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
        System.out.println(Mathey.ceil(3.0000001331412)); // 4

    }
}
