package com.etu;

// 5427
// 5416
class Person implements Cloneable, Comparable<Person> {

    private int age;
    private final String name;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is negative: " + age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person {" + name + ", " + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj;
        return other.age == age && other.name.equals(name);
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.age);
    }
}

