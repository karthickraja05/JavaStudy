public class Relation {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        float c = 5;
        System.out.println(a == b);
        System.out.println(b != c);
        System.out.println(c);
        
        char attendance = 'P';


        if(attendance == 'P'){
            System.out.println("Class attended");
        }else if (attendance == 'O') {
            System.out.println("On Duty");
        }else{
            System.out.println("Class not attended");
        }

        switch (attendance) {
            case 'P':
                System.out.println("Class attended");
                break;
            case 'O':
                System.out.println("On duty");
                break;
            default:
                System.out.println("Class not attended");
                break;
        }

    }
}
