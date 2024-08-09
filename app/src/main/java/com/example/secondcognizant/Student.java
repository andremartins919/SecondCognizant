package com.example.secondcognizant;

public class Student {

    String name;
    String postalAddress;
    int age;

    public Student(String name, String postalAddress, int age) {
        this.name = name;
        this.postalAddress = postalAddress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
