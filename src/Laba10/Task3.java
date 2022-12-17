package Laba10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static List<String> readMethod(File file) {

        List<String> textList = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            textList = new ArrayList<>();

            while ((input = reader.readLine()) != null) {

                textList.add(input);

            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());

        } return textList;

    }

//    public static void writeMethod(String text2) {
//
//        File file2 = new File("files/text2.txt");
//
//        try (BufferedReader reader = new BufferedReader(new StringReader(text2)); BufferedWriter writer = new BufferedWriter(new FileWriter(file2))){
//            if (reader.ready()){
//                writer.write(reader.readLine());
//            }
//
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//
//        }
//    }

    public static void splitFileMethod(File file, File file2) {

        File file3 = new File("files/text3.txt");
//        String stringText1 = textList.toString();
//        String split = stringText1.split(" ");

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file3))){

            if (reader.ready() && reader2.ready()){
                String input;
                while ((input = reader.readLine()) != null) {

                    writer.write(input);
                    System.out.println(input);

                }
                writer.write("\n" + reader2.readLine());
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());

        }
    }

    public static void main(String[] args) {

        File file = new File("files/text.txt");
        File file2 = new File("files/text2.txt");

        splitFileMethod(file, file2);
    }
}
