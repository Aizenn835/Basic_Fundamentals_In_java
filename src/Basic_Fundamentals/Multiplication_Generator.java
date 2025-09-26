package Basic_Fundamentals;

 import java.util.Scanner;

public class Multiplication_Generator {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

         System.out.print("Enter number: ");
         int n = scanner.nextInt();

            for(int i = 1; i <= 10; i++){
                System.out.println( i + " x " + n + " = " + n * i);
            }
     }
}
