package java_core;
import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class hashmap {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         LinkedHashMap<String , Integer> map = new LinkedHashMap<>();

          try {
              System.out.print("Enter your product: ");
              String prod = scanner.nextLine().toUpperCase();

              System.out.print("Enter product price: ");
              int price = scanner.nextInt();
               map.put(prod , price);

          }catch(InputMismatchException e) {
              System.out.println("Inputed mismatch to given: " + e.getMessage());
          }
          map.put("BANANA" , 50);
          map.put("PINEAPPLE" , 70);

            for(Map.Entry<String , Integer> loop : map.entrySet()){
                System.out.println(loop.getKey() + ": " + loop.getValue());
            }

         scanner.nextLine();
         System.out.print("Removing products?: ");
         String removeprod = scanner.nextLine().toUpperCase().trim();

          if(map.containsKey(removeprod)){
               map.remove(removeprod);
              System.out.println("Successfully remove: " + removeprod);
          }

          for(Map.Entry<String , Integer> newloop : map.entrySet()){
              System.out.println(newloop.getKey() + ": " + newloop.getValue());
          }




     }
}
