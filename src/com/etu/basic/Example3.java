package com.etu.basic;

public class Example3 {

    public static void main(String[] args) {
        Person person = new Student("Alex", 6351);
        System.out.println(person.getAge());
        System.out.println(person.getName());

        Student student = (Student) person;
        System.out.println(student.getGroup());

        person.setAge(20);

        System.out.println(student.getAge());
    }
}
