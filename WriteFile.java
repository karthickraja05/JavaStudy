import java.io.File;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            File f = new File("Sample.txt");
            FileWriter fw = new FileWriter("Sample.txt", true);
                
            fw.append("Karthickraja welcome to my world\n");
            fw.append("Java File Handling\n");
            fw.append("Learning Java\n");
            fw.append("Learning Java");
            fw.append("Learning Java");

            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
