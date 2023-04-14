package com.files;

import java.io.FileReader;
import java.io.IOException;

public class Read {
    protected void execute(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);

            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char)i);
            }

            fileReader.close();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }
}
