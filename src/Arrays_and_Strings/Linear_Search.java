package Arrays_and_Strings;

public class Linear_Search {
     public static int Using_Linear(int[] array , int target){

         for(int i = 0; i < array.length; i++){
              if(array[i] == target){
                   return i;
              }
         }
          return -1;
     }
      public static void main(String[] args){
          int[] array = { 21 , 45 , 24 , 53 , 57 , 199 , 201 , 28};
          int target = 45;

            int result = Using_Linear(array , target);

              if(result != -1){
                  System.out.println("Element found at index: " + result);
              }else{
                  System.out.println("Element not found: " + result);
              }
      }
}
