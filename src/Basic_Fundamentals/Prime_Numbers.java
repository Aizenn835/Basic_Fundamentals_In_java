package Basic_Fundamentals;

 import java.util.Scanner;

public class Prime_Numbers {
     public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a number: ");
         int checker = scanner.nextInt();

              if(checker % 2 == 0){
                  System.out.println("Number is prime.");
              }else{
                  System.out.println("Number is not a prime.");
              }

     }
}
