package lesson6.rw;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRunner {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("files/text3.txt")) {
            writer.append("Hello");
            writer.append("Java!");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
