package main;

import main.service.Reader;
import main.service.Writer;

public class Main {

    public static void main(String[] args) {
        final  String FILE_NAME = "a_an_example.txt";

        Reader reader = new Reader();
        Writer writer = new Writer();

        try {
            String solution = reader.getOnePizza(reader.readFromFileToHashMap(FILE_NAME));

            writer.writeIntoFile(solution, FILE_NAME);

        } catch (Exception e){
            System.out.println("ERROR: " + e);
        }
    }
}
