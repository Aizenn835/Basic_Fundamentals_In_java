
package Array_and_Strings;


 public class Binary_search{
        public static int binary_searching(int[] array , int target){
            int left = 0;
            int right = array.length - 1;

              while(left <= right){
                    int mid = left + (right - left) / 2; // 4

                     if(array[mid] == target){
                          return mid;
                     }
                     if(array[mid] < target){
                         left = mid + 1;
                     }
                      else{
                           right = mid - 1;
                     }
              }
               return -1;
        }
         public static void main(String[] args){
             int[] array = {2, 4, 7, 10, 13, 18, 21, 27, 33, 40};
             int target = 33;

               int result = binary_searching(array , target);

                 if(target != -1){
                     System.out.println("Element of number is: " + result );
                 }
                 else{
                     System.out.println("Did not find array.");
                 }
         }
 }