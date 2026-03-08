package Basic_Fundamentals;

public class IfElseCondition {
    public static void main(String[] args) {
        int age = 19;
        String name = "Lei Justine Clemente";
        String course = "BSIT";
        String container = "Lei Justine Clemente";

        if(age >= 19 && name.equals(container) && course.equals("BSIT")){
            System.out.println("Your an adult! Studying BSIT.");
        }else System.out.println("Your a minor!");
    }
}
