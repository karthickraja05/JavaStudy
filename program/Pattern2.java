package program;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 10;

        // for (int i = 1; i <= n; i++) {
        //     int k = n - i;
        //     for (int j = 1; j <= n; j++) {
        //         if(k >= j){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // patternName2();

        coupleName();
        
    }    


    public static void patternName(){
        String name = "Bhuvana";
        
        for (int i = 0; i < name.length(); i++) {
            int k = name.length() - i - 1;
            for (int j = 0; j < name.length(); j++) {
                if(k > j){
                    System.out.print(" ");
                }else{
                    System.out.print(name.charAt(j));
                }
            }
            System.out.println();
        }


    }

    public static void patternName2(){
        String name = "Bhuvana";

        for (int i = 0; i < name.length(); i++) {
            int k = name.length() - i - 1;
            int z = 0;
            for (int j = 0; j < name.length(); j++) {
                if(k > j){
                    System.out.print(" ");
                }else{
                    System.out.print(name.charAt(z));
                    z++;
                }
            }
            System.out.println();
        }


    }

    public static void coupleName(){
        String name = "Karthic";
        String name2 = "Bhuvana";

        for (int i = 0; i < name.length(); i++) {
            int k = name.length() - i - 1;
            int z = 0;
            int y = 0;
            for (int j = 0; j < name.length(); j++) {
                if(k > j){
                    System.out.print(" ");
                }else{
                    System.out.print(name.charAt(z));
                    z++;
                }
            }
            System.out.print("|");
            for (int x = 0; x <= i; x++) {
                System.out.print(name2.charAt(x));
            }
            System.out.println();
        }


    }
}
