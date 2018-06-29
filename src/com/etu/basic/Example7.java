package com.etu.basic;

import java.util.Arrays;
import java.util.Comparator;

public class Example7 {

    public static void main(String[] args) {
        Student[] students = {
                new Student(24, "d", 1),
                new Student(22, "b", 2),
                new Student(24, "e", 3),
                new Student(25, "a", 1),
                new Student(27, "c", 4),
        };

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(students));
    }

//    private static String arrayToString(Student[] students) {
//        StringBuilder builder = new StringBuilder();
//        for (Student student : students) {
//            builder.append(student.toString())
//                   .append(", ");
//        }
//        builder.setLength(builder.length() - 2);
//        return builder.toString();
//    }
}

class StudentsByNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class StudentsByGroupComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGroup(), o2.getGroup());
    }
}