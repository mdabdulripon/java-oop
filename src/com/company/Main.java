package com.company;

public class Main {

    public static void main(String[] args) {

        // To Access the static method, you can directly use the class name followed by the method name.
        Person.displayStaticName("Ripon");

        // to Access the Regular method need create an object of the class
        Person p = new Person();
        p.displayName("Riyan");


    }
}
