package lesson6.io;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamRunner {
    public static void main(String[] args) throws IOException {

        try(FileOutputStream outputStream = new FileOutputStream("files/text4.txt", true)) {
            String value = "Hello Java";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
