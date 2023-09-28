import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1/2/3/4/5): ");
            
            // Read user's choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Addition
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    int difference = num1 - num2;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    // Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    int product = num1 * num2;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    // Division
                    System.out.print("Enter dividend: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter divisor: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        double quotient = (double) num1 / num2;
                        System.out.println("Result: " + quotient);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the calculator.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1/2/3/4/5).");
                    break;
            }
        } while (choice != 5);

    }
}
