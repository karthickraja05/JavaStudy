package TestApp1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your username:");
        Scanner input = new Scanner(System.in);
        String user_name = input.next();
        System.out.println("Enter your pin:");
        int pin = input.nextInt();
        System.out.println("Username:" + user_name);
        System.out.println("Pin:" + pin);
    }

    



}
