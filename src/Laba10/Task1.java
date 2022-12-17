package Laba10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

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


    public static void main(String[] args) {
        File file = new File("files/text.txt");

        System.out.println(readMethod(file).toString());

    }
}
