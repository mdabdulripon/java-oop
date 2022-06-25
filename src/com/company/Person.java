package com.company;

public class Person {

    /**
     * Regular Method
     * To Access regular method you need to create an instances
     * */

    public void displayName(String name) {
        System.out.println("Your name is " +  name);
    }

    /**
     * * Static Method
     *
     * You do not need to create an instances of this class
     * You can directly access the is methods.
     * */

    public static void displayStaticName(String name) {
        System.out.println("Your name is " + name);
    }



}
