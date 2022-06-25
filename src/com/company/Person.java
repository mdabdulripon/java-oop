package com.company;

public class Person {
    // Method Overloading

    void displayAge() {
        System.out.println("you age is 20");
    }

    void displayAge(int age) {
        System.out.println("you age is "+ age);
    }

    void displayAge(double age) {
        System.out.println("you age is "+ age);
    }
}
