package Arrays_and_Strings;

public class Lowest_Number {
     public static void main(String[] args) {

         int[] arrays_of_numbers = { 35, 12 , 62 , 244 , 246 , 1234};

         System.out.println("Arrays of Numbers: ");
          for(int i = 0; i < arrays_of_numbers.length; i++){
              System.out.print(arrays_of_numbers[i] + " ");
          }

         System.out.println("\nFinding the lowest number: ");
           int lowest = arrays_of_numbers[0];

           for(Integer i : arrays_of_numbers){
                  if(lowest > i){
                     lowest = i;
                  }
           }
         System.out.println("Lowest number: " + lowest);

     }
}
