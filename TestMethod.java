public class TestMethod {
    public static void main(String[] args) {
        add(5,6);
        System.out.println(add(5,6,9));;
        add();
    }

    public static void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static int add(int a, int b,int d){
        int c = a + b + d;
        // System.out.println(c); 
        return c;
    }

    public static void add(){
        int c = 20 + 1;
        System.out.println(c); 
        // return c;
    }

    
}
