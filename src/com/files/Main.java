package com.files;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** *****");
        System.out.println("INSERT FILE NAME: ");
        System.out.println("***** *****");

        String fileName = scanner.next();
        scanner.nextLine();

        System.out.println("***** *****");
        System.out.println("INSERT FILE CONTENT: ");
        System.out.println("***** *****");

        String fileContent = scanner.nextLine();

        Write write = new Write();

        write.execute(fileName, fileContent);

        System.out.println("***** *****");
        System.out.println("FILE CONTENT: ");
        System.out.println("***** *****");

        Read read = new Read();

        read.execute(fileName);
        scanner.close();
    }
}