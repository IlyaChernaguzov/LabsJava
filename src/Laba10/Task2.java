package Laba10;

import java.io.*;
import java.util.List;

public class Task2 {

    public static void writeMethod(String text2) {

        File file2 = new File("files/text2.txt");

        try (BufferedReader reader = new BufferedReader(new StringReader(text2)); BufferedWriter writer = new BufferedWriter(new FileWriter(file2))){
            if (reader.ready()){
                writer.write(reader.readLine());
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());

        }
    }

    public static void main(String[] args) {

        String text2 = "Разработчик Java — это программист, который проектирует, разрабатывает и управляет приложениями и программным обеспечением на основе Java. Поскольку большинство крупных организаций используют Java для реализации программных систем и серверных служб, разработчик Java является одной из самых востребованных профессий сегодня.";

        writeMethod(text2);

    }
}
