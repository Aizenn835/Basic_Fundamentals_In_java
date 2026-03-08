package Basic_Fundamentals;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator Menu ===");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {

            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid option selected.");
        }

        scanner.close();
    }
}
