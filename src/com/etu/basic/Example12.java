package com.etu.basic;

import java.io.*;

public class Example12 {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter your age: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
        String ageString = bufferedReader.readLine();

        double age = Double.valueOf(ageString);

        System.out.println(age + 10);
    }
}
