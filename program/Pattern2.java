package program;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            int k = n - i;
            for (int j = 1; j <= n; j++) {
                if(k >= j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }    
}
