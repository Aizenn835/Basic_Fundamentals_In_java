package Arrays_and_Strings;

 import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          int[][] array = new int[3][2];

           for(int r = 0; r < 3; r++){
               System.out.print("Enter 2 numbers: ");
                for(int c = 0; c < 2; c++){
                     array[r][c] = scanner.nextInt();
                }
           }
        System.out.println("Result:");
            for(int r = 0; r < 3; r++){
                 for(int c = 0; c < 2; c++){
                     System.out.print(array[r][c] + " ");
                 }
            }
    }
}
