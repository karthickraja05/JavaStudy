import java.math.BigDecimal;
import java.util.Date;
import java.awt.Point;

public class IntStudy {
    public static void main(String[] args) {
        // byte -128 to 127
        // short -32k, 32k
        // int -2b,2b
        // long morethan 2b 
        // long number = 18000000000l;
        // byte age = 19;
        // float mark = 95.7777777777777599999F;
        // double mark1 = 95.7777777777777599999;

        // BigDecimal a = new BigDecimal("0.1000001");
        // BigDecimal b = new BigDecimal("0.2");
        // BigDecimal c = b.add(a);
        // System.out.println(c);
        // System.out.println(age);
        // System.out.println(number);
        // System.out.println(mark);
        // System.out.println(mark1);


        // boolean pass = false;
        // System.out.println(pass);

        // char grade = 'A';
        // System.out.println(grade);


        Date today = new Date();
        System.out.println(today);

        Point p1 = new Point(5,7);
        Point p2 = p1;
        System.out.println(p2);
        p1.x=8;

        System.out.println(p2);
        System.out.println(p1);



    }
}
