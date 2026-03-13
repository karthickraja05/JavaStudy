import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = input.next().charAt(0);

        System.out.print("Enter your name: ");
        String name = input.next();

        User obj = new User();
        obj.setValue(name,year,gender);
        obj.print();


    }
}


class User {
    private String name;
    private int birthYear;
    private char gender;

    void setValue(String name , int birthYear, char gender){
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    void print(){
        System.out.println("My name is " + this.name);
        System.out.println("Birth year is " + this.birthYear);
        System.out.println("Gender: " + (this.gender == 'M' ? "Male" : "Female"));
    }




}