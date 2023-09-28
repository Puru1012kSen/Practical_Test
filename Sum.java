import java.util.*;

public class Sum {
    public static void main(String[] args) {

        int sum = 0;

        // Iterate through numbers from start to end
        for (int i = 25; i <= 51; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add even number to the sum
            }
        }

        System.out.println("Sum of even numbers between 25 and 51 is: " + sum);
    }
}
