package Arrays_and_Strings;

 import java.util.Collections;
 import java.util.Comparator;

public class Reverse_array {
       public static void reverse_array(int[] arr){
           int a = arr.length - 1;
           int[] b = new int[a];

           System.out.println("Original Array: ");
             for(int i = 0; i < a; i++){
                 System.out.print(arr[i] + " ");
                  b[i] = arr[a - i];
             }
           System.out.println();

           System.out.println("Reverse Array: ");
             for(int i = 0; i < a; i++){
                  arr[i] = b[i];
                 System.out.print(arr[i] + " ");
             }
       }
    public static void main(String[] args){
           int[] arr = {1 , 2 , 3 , 4 , 5 , 6};
              reverse_array(arr);
    }
}
