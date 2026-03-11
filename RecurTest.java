import java.math.BigDecimal;

public class RecurTest {
    public static void main(String[] args) {
        // numPrint(10);
        int fact = factorial(20);
        System.out.println(fact);

        BigDecimal n = new BigDecimal("30");
        BigDecimal fact2 = factorial2(n);
        System.out.println(fact2);
    }

    public static void numPrint(int n){
        if(n == 1){
            System.out.println(n);
        }else{
            System.out.println(n);
            numPrint(n-1);
        }
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static BigDecimal factorial2(BigDecimal n){
        if(n.equals(BigDecimal.ONE)){
            return BigDecimal.ONE;
        }else{
            BigDecimal c = n.subtract(BigDecimal.ONE);
            return n.multiply(factorial2(c));
        }
    }
}
