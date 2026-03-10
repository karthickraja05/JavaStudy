import java.math.BigDecimal;

public class LoopTest {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("Loop Interation: "+i);
        // }
        BigDecimal n = new BigDecimal("1");
        int range = 100;
        for (int i = 2; i <= range; i++) {
            BigDecimal t = new BigDecimal(i);
            n = n.multiply(t);   
        }

        System.out.println(n);
    }
}
