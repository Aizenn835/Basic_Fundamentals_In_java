package Arrays_and_Strings;

public class Sum_Arrays {
    public static void main(String[] args){
        int[] array = {12 , 34 , 12 , 23};
        int total = 0;
        int grandTotal = array.length - 1;

        for(int i =  0; i <= grandTotal ; i++){
              total += array[i];
         }
        System.out.println("Total: " + total);
    }
}
