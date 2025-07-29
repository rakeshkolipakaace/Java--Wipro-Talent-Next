package IOStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class assignment2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Input.txt");
            FileWriter writer = new FileWriter("Output.txt");
            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
            }
            reader.close();
            writer.close();
            System.out.println("File is copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
