package Laba10;

import java.io.*;
import java.util.ArrayList;

public class Task4 {

    public static String fileReaderMethod(File file) {


        String p = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;

            while ((input = reader.readLine()) != null) {

                p = input.replaceAll("\\W", "\\$");
//                System.out.println(p);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());

        }

        return p;
    }


    public static void fileWriterMethod(String p, File file) {

        try (BufferedReader reader = new BufferedReader(new StringReader(p)); BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            if (reader.ready()){
                writer.write(reader.readLine());
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());

        }

    }





    public static void main(String[] args) {

        File file = new File("files/text4.txt");

        System.out.println(fileReaderMethod(file));
        fileWriterMethod(fileReaderMethod(file), file);

    }
}
