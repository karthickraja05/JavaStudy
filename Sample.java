public class Sample {
    int roll_no;

    int marks;

    int c;

    Sample(int a, int b,int c){
        roll_no = a;
        marks = b;
    }

    Sample(int a, int b) {
        roll_no = a + 3;
        marks = b + 1;
        c = 4;   // default value
    }
}


class Construct {

    public static void main(String[] args) {
        Sample obj = new Sample(45000,34,45);
        System.out.println(obj.roll_no);
        System.out.println(obj.marks);
    }
}