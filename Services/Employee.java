package Services;

public class Employee {
    String name;

    short age;

    // int roll_no;

    public void display(){
        System.out.println(name);
        System.out.println(age);
        // System.out.println(roll_no);
    }

    public static void main(String[] args) {
        Employee user1 = new Employee();
        user1.name = "Karthickraja";
        user1.age = 29;
        // user1.roll_no = 2026031996;

        // user1.display();

        // int[] users = new int[10];
        int[] usersAge = {10,20,30,40,50,60,70,80,90,100};
        String[] usersName = {
            "Karthickraja",
            "Arun",
            "Vijay",
            "Surya",
            "Ajith",
            "Rahul",
            "Manoj",
            "Kiran",
            "Praveen",
            "Sathish"
        };
        Employee[] employees = new Employee[usersName.length];
        for (int i = 0; i < usersName.length; i++) {
            employees[i] = new Employee();
            employees[i].name = usersName[i];
            employees[i].age = (short) usersAge[i];
        }
        employees[7].display();
        // System.out.println();

    }
}
