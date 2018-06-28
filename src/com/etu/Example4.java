package com.etu;

public class Example4 {

    public static void main(String[] args) {
//        int value = 10;
//        System.out.println("main before: " + value);
//        method(value);
//        System.out.println("main after: " + value);

        Student student1 = new Student(10, "Alex", 0);
        Student student2 = new Student(10, "Alex", 0);
        boolean isEquals = student1 == student2;
        System.out.println(isEquals);


//        System.out.println("main before: " + student.getAge() + " " + student.getName() + " " + student.getGroup());
//        method(student);
//        System.out.println("main after: " + student.getAge());
    }

    public static void method(Student student) {
        System.out.println("method before: " + student.getAge());
        student.setAge(25);
        System.out.println("method after: " + student.getAge());
    }

    public static void method(int value) {
        System.out.println("method before: " + value);
        value++;
        System.out.println("method after: " + value);
    }

}
