package com.aldinrizvo.qamp.oophomework2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<Student> studentList;

    public Classroom() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(final Student student) {
        this.studentList.add(student);
    }

    public boolean isPresent(final String name) {
        for (final Student student : this.studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }

        return false;
    }

    public void printClassroom() {
        for (final Student student : studentList) {
            System.out.println(student);
        }
    }
}
