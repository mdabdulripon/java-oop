package com.company;

public class Main {

    public static void main(String[] args) {
        // Using default constructor
        Person riyan = new Person();
        // 1st method will invoke
        riyan.displayAge();
        // 2nd method will invoke
        riyan.displayAge(2);
        // 3rd method will invoke
        riyan.displayAge(1.9);
    }
}
