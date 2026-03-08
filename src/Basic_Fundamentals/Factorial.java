package Basic_Fundamentals;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 1;
        for(int i = n; i > 0; i--){
            sum*=i;
        }
        System.out.println("Total: " + sum);
    }
}
