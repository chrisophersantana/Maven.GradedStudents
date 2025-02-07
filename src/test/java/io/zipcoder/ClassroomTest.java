package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getStudent() {

    }

    @Test
    public void getAverareExamScore() {
       ArrayList<Double>  s1Scores = new ArrayList<>(Arrays.asList( 100.0, 150.0 ));
        ArrayList<Double>  s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student{s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void addStudent() {
    }

    @Test
    public void removeStudent() {
    }

    @Test
    public void getStudentByScore() {
    }

    @Test
    public void getGradeBook() {
    }
}
