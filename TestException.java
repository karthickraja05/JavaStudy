public class TestException {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {
            check(56);
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("b is 0");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("new ");    
        }
        finally{
            System.out.println("Welcome to home");
        }
        System.out.println("Hello World");
    }


    static void check(int age) throws Exception , UserDefined{
        if(age < 18){
            throw new Exception("Age is invalid2");
        }else if (age < 45) {
            throw new ArithmeticException("Age is invalid");
        }else if (age < 67) {
            throw new ArithmeticException("User defined err");
        }
    }
}


class UserDefined extends Exception {
    UserDefined(String str){
        super(str);
    }
}