package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    protected void execute(String fileName, String content) {
        try {
            FileWriter fw = new FileWriter(fileName);

            fw.write(content);

            fw.close();

            System.out.println("Successfully Written");
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
