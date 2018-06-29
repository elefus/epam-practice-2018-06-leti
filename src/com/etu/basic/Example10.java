package com.etu.basic;

import java.util.Random;

public class Example10 {

    public static void main(String[] args) {
//        new Example10().method(0);
        method(0);
    }

    public static void method(int level) {
        Random random = new Random();
        double val1 = random.nextDouble();
        double val2 = random.nextDouble();
        System.out.println(level + " " + val1 + " " + val2);
        method(level + 1);
    }
}
