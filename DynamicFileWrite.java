import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class DynamicFileWrite {
     public static void main(String[] args) {
        try {
            makeDir();
            Scanner input = new Scanner(System.in);
            System.out.println("Which file you need to check (type without space):");
            String fileName = input.next();
            fileName = "files/" + fileName + ".txt";
            System.out.println(fileName);
            System.out.println("do you want read file (Y/N)?");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void makeDir(){
        File dir = new File("files");

        if (!(dir.exists() && dir.isDirectory())) {
            System.out.println("Directory does not exist, so, created by system");
            dir.mkdirs();
        }
    }

    static void checkFileStatus(String fileName) {
        try {
            File file = new File(fileName);

            if (file.exists()) {
                System.out.println("File already exists: " + fileName);
            } else {
                file.createNewFile();
                System.out.println("File created: " + fileName);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void readFile(){
        File dir = new File("files");

        if (!(dir.exists() && dir.isDirectory())) {
            System.out.println("Directory does not exist, so, created by system");
            dir.mkdirs();
        }
    }
}
