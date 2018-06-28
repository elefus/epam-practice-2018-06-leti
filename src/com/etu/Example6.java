package com.etu;

import java.util.Arrays;

public class Example6 {

    public static void main(String[] args) {
        Student student = new Student(10, "Alex", 10);

        System.out.println(student instanceof Cloneable);

        Student clone = student.clone();
        System.out.println(student == clone);
        System.out.println(student.equals(clone));
    }
}
