package Arrays_and_Strings;

public class LargestElementsInArray {
     public static void main(String[] args){
         int[] array_of_numbers = { 23 , 45 , 35 , 12 , 19 };

         System.out.println("Numbers List: ");
          for(int i = 0; i < array_of_numbers.length; i++){
              System.out.print(array_of_numbers[i] + " \n");
          }
           int max = array_of_numbers[0];

                for(int i = 0; i < array_of_numbers.length; i++){
                     if(max < array_of_numbers[i]){
                          max = array_of_numbers[i];
                     }
                }
         System.out.println("Maximum numbers in array: " + max);
     }
}
