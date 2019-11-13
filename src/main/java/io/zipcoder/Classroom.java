package io.zipcoder;

import java.util.*;

public class Classroom {

    Student[] student;
    int maxNumberOfStudents;


    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        student = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] student) {
        this.student = student;


    }

    public Classroom() {


    }

    public Student[] getStudent() {

        return student;
    }

    public Double getAverareExamScore() {

        Double sum = 0.0;

        for (int i = 0; i < student.length; i++) {
            sum += student[i].getAverageExamScore();


        }
        Double average = sum / student.length;

        return average;


    }

    public void addStudent(Student alumni) {


        for (int i = 0; i < student.length; i++) {
            student[i] = alumni;
        }


    }

    public void removeStudent(String firsName, String lastName) {

        for (int i = 0; i < student.length; i++) {
            if (student[i].getFirstName().equals(firsName) && student[i].getLastName().equals(lastName)) {
                student[i] = null;
            }
        }
    }

    public Student[] getStudentByScore() {
        Arrays.sort(student, Collections.reverseOrder());
        return student;
    }

    public Map getGradeBook() {
        Map<String, Student> gradeBook = new TreeMap();

        for (Student c : student) {
            if (c.getAverageExamScore() / 100 > .90) {
                gradeBook.put("A", c);

            } else if (c.getAverageExamScore() / 100 > .80) {
                gradeBook.put("B", c);

            } else if (c.getAverageExamScore() / 100 > .70) {
                gradeBook.put("C", c);
            } else if (c.getAverageExamScore() / 100 > .60) {
                gradeBook.put("D", c);
            } else {
                gradeBook.put("F", c);
            }

        }
        return gradeBook;
    }
}








































