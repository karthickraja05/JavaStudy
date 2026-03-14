package program;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // patternName();

        inputPatternName();
        
    }    

    public static void inputPatternName(){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        // System.out.println(name.charAt(0));

        // System.out.println(name.length());

        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }

    public static void patternName(){
        String name = "Bhuvana";
        // System.out.println(name.charAt(0));

        // System.out.println(name.length());

        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }


    }
}
