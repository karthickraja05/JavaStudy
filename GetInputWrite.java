import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class GetInputWrite {
    public static void main(String[] args) {
        try {
            File file = new File("names2.txt");
            FileWriter fw = new FileWriter(file,true);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name to add file: (Q - for quit)");

            while(true){
                String inputData = input.nextLine();
                if(inputData.equalsIgnoreCase("Q")){
                    System.out.println("Quitting system...");
                    break;
                }
                fw.append(inputData+System.lineSeparator());
                System.out.println("Next name to add file or (Q - for quit): ");
            }
            
            input.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
