package com.company;

public class Student {
    // Properties:
    int id;
    int phy;
    int chem;
    int math;

    // Constructor
    Student() {}

    Student(int id, int phy, int chem, int math) {
        this.id = id;
        this.phy = phy;
        this.chem = chem;
        this.math = math;
    }

    // Methods
    double averageGrade(int sum) {
        return sum / 3;
    }

    int sumGrade() {
        return phy + chem + math;
    }
}
