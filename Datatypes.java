import java.util.Arrays;

public class Datatypes {

    public static void main(String[] args) {
        String s = Integer.toString(45);
        System.out.println(s);

        String y = Integer.toBinaryString(15);
        System.out.println(y);


        int x = Integer.valueOf(y);
        System.out.println(x);

        String c = Integer.toOctalString(57);
        System.out.println(c);


        String name = "Karthickraja";
        System.out.println(name.equals("Welcome to myname"));
        System.out.println(name.equals("karthickraja"));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toLowerCase());

        name = name.concat("oodt");
        System.out.println(name);
        char[] arr = name.toCharArray();
        System.out.println(arr[2]);
        System.out.println(arr);

        char[] arr2 = new char[3];
        arr2[2] = 'O';
        arr2[0] = 'R';
        arr2[1] = 'I';
        System.out.println(arr2);


        String[] arr3 = new String[2];
        arr3[0] = "Karthick";
        arr3[1] = "Raja";
        System.out.println(arr3);

        String newStr1 = Arrays.toString(arr3);

        System.out.println(newStr1);

        String newStr2 = String.join(" ", arr3);
        System.out.println(newStr2);

        String text = "apple,banana,mango";
        String[] strArr = text.split(",");
        System.out.println(strArr[1]);
        System.out.println(strArr.length);

        String welcome = "5.928288234838438";
        System.out.println(Double.parseDouble(welcome));    
        try {
            System.out.println(Double.parseDouble(text));        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}