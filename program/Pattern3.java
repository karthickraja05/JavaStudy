package program;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            int z = n + i;
            int k = n - i - 1;
            for (int j = 1; j <= z; j++) {
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
