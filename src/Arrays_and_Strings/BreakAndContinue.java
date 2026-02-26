package Arrays_and_Strings;

public class BreakAndContinue {
    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i <= n; i++){
            if(i == 6){
                continue;
            }else if(i == 9){
                break;
            }
            System.out.println(i);
        }
    }
}
