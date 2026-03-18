package util;

import java.io.FileWriter;

public class DataSave {
    public void save(String email, String password, String age){
        try {
            FileWriter file_Writer = new FileWriter("util/form_data.txt",true);
            String inpuString = "Email: " + email + ", Password: " + password + ", Age: " + age;
            file_Writer.append(inpuString+System.lineSeparator());

            file_Writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
