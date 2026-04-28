import java.util.Scanner;

public class ArithmeticCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        System.out.println("=== Java Modular Calculator ===");

        while (!exit) {
            displayMenu();
            int choice = getValidIntegerInput("Enter your choice (1-6): ");

            if (choice >= 1 && choice <= 5) {
                double num1 = getValidDoubleInput("Enter first number: ");
                double num2 = getValidDoubleInput("Enter second number: ");
                performOperation(choice, num1, num2);
            } else if (choice == 6) {
                System.out.println("Exiting... Goodbye!");
                exit = true;
            } else {
                System.out.println("Invalid choice. Please pick a number between 1 and 6.");
            }
            System.out.println(); // Spacing
        }
        scanner.close();
    }

    // --- Menu and Logic ---

    private static void displayMenu() {
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Exit");
    }

    private static void performOperation(int choice, double n1, double n2) {
        switch (choice) {
            case 1 -> System.out.printf("Result: %.2f + %.2f = %.2f%n", n1, n2, add(n1, n2));
            case 2 -> System.out.printf("Result: %.2f - %.2f = %.2f%n", n1, n2, subtract(n1, n2));
            case 3 -> System.out.printf("Result: %.2f * %.2f = %.2f%n", n1, n2, multiply(n1, n2));
            case 4 -> {
                if (n2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", n1, n2, divide(n1, n2));
                }
            }
            case 5 -> {
                if (n2 == 0) {
                    System.out.println("Error: Cannot perform modulus by zero.");
                } else {
                    System.out.printf("Result: %.2f %% %.2f = %.2f%n", n1, n2, modulus(n1, n2));
                }
            }
        }
    }

    // --- Arithmetic Methods ---

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }
    public static double modulus(double a, double b) { return a % b; }

    // --- Input Validation ---

    private static int getValidIntegerInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); // Clear invalid token
            }
        }
    }

    private static double getValidDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid token
            }
        }
    }
}