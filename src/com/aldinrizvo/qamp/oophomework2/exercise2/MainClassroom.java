package com.aldinrizvo.qamp.oophomework2.exercise2;

public class MainClassroom {
    public static void main(String[] args) {
        final Student student1 = new Student("Aldin Rizvo", 26);
        final Student student2 = new Student("Hana Bezdrob", 25);
        final Student student3 = new Student("John Cena");

        String[] studentNames = {"Aldin Rizvo", "Neko Nekic", "Hana Bezdrob", "Niko Nikic"};

        Classroom studentsList = new Classroom();

        studentsList.addStudent(student1);
        studentsList.addStudent(student2);
        studentsList.addStudent(student3);

        studentsList.printClassroom();

        System.out.println("\nPresent students: ");
        for (final String name : studentNames) {
            if (studentsList.isPresent(name)) {
                System.out.println(name);
            }
        }
    }
}
