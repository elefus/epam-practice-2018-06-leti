package com.etu;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Example14 {

    public static void main(String[] args) throws IOException {
//        BufferedReader fileReader = new BufferedReader(new FileReader("input.data"));
//        String line = fileReader.readLine();
//        String[] parties = line.split("\\s+");
//        System.out.println(Arrays.toString(parties));

        Scanner scanner = new Scanner(new File("input.data"));
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {

            }
            System.out.println(scanner.nextInt());
        }
    }
}
