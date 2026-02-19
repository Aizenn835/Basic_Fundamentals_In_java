package Basic_Fundamentals;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int count = scanner.nextInt();

        while(count > 0){

            scanner.nextLine();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();



            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Name: " + name + "\n" +  "Age: " + age);
            count--;
        }

    }
}
