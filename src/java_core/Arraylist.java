package java_core;

 import java.util.ArrayList;
 import java.util.Scanner;

public class Arraylist {
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);

           ArrayList<String> shop_list = new ArrayList<>();

             shop_list.add("apple");
             shop_list.add("banana");
             shop_list.add("pineapple");

              for(String loop : shop_list){
                  System.out.println(loop);
              }

          System.out.print("Remove something?: ");
          String Remove = scanner.nextLine().toLowerCase();


          if (shop_list.remove(Remove)) {
              System.out.println(Remove + " was removed!");
          } else {
              System.out.println(Remove + " not found in the list.");
          }
          System.out.println("New List:");
          for(String loop : shop_list){
              System.out.println(loop);
          }





      }
}
