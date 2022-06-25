package com.company;

public class Main {

    public static void main(String[] args) {
        // Using default constructor
        Student riyan = new Student(1, 98, 92, 91);
        int total = riyan.sumGrade();
        double average = riyan.averageGrade(total);
        System.out.println("Total " + total);
        System.out.println("Average " + average);
    }
}
