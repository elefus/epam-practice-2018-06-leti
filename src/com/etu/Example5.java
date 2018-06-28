package com.etu;

public class Example5 {

    public static void main(String[] args) {
        Student student1 = new Student(10, "Alex", 10);
        Student student2 = new Student(10, "Alex", 10);
        boolean isEquals = student1 == student2;

        System.out.println(isEquals);


        String string = "hello";
        System.out.println(student1.equals(string));




//        double valueA = 5.00000000001;
//        double valueB = 5.00000000000;
//        double eps = 0.00001;
//
//        if (Math.abs(valueA - valueB) < eps) {
//
//        }

    }
}
