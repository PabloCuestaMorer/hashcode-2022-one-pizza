package main.service;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

public class Writer {

    public void writeIntoFile(String solution, String fileName) {
        try (PrintWriter printWriter = new PrintWriter("output\\" + fileName, "UTF-8");) {
            System.out.println("\n------- output " + fileName);
            printWriter.print(solution);
        } catch (Exception e) {
            System.err.println("" + e);
        }
    }
}