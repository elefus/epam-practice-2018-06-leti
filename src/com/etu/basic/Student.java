package com.etu.basic;

class Student extends Person {

    private final int group;

    public Student(int age, String name, int group) {
        super(age, name);
        this.group = group;
    }

    public Student(String name, int group) {
        super(19, name);
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        String base = super.toString().substring(8);
        base = base.substring(0, base.length() - 1);
        return "Student {" + base + ", " + group + "}";
    }

    @Override
    public boolean equals(Object obj) {
//        Class<?> objectClass = obj.getClass();
//        if (objectClass != Student.class) {
//            return false;
//        }
        if (obj instanceof Student) {
            Student other = (Student) obj;
            return super.equals(obj) && group == other.group;
        } else {
            return false;
        }
    }

    @Override
    public Student clone() {
        return (Student) super.clone();
    }
}
