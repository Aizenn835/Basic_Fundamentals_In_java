package Basic_Fundamentals;
import java.util.Scanner;

public class Arithmetic_Using_Calcu {
      public static void main(String[] args){

          Scanner scanner = new Scanner(System.in);

          System.out.println("===============");
          System.out.println("Basic Calculator");
          System.out.println("===============");

          System.out.print("Enter your number: ");
          int num1 = scanner.nextInt();
          char op = scanner.next().charAt(0);
          int num2 = scanner.nextInt();

            switch(op){
                case 'x' -> {
                    System.out.println(num1 * num2);
                }
                case '/' -> {
                    try {
                        System.out.println(num1 / num2);
                    }catch(ArithmeticException e){
                        System.out.println("Cannot divide by zero: " + e.getCause());
                    }
                }
                case '+' ->{
                    System.out.println(num1 + num2);
                }
                case '-' ->{
                    System.out.println(num1 - num2);
                }
                default -> System.out.println("Operator is invalid!");
            }
      }
}
