package Basic_Fundamentals;

public class Nested_ForLoop {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i <= n; i++){
            for(int c = 0 ; c < n; c++){
                System.out.print(i + "" + c + " ");
            }
        }
    }
}
