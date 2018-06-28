package com.etu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Example13 {

    public static void main(String[] args) throws IOException, InterruptedException {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write("Hello from java-program");
        }

//        Thread.sleep((3 * 60 + 20) * 60 * 1000);
        TimeUnit.SECONDS.sleep(1);

        System.out.println("Main ends");
    }


}
