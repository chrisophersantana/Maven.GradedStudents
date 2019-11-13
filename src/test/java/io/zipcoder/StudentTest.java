package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void getFirstNameTest() {
        Student student = new Student("Tidus", null, null);

        String expectedFirstName = "Tidus";
        String actualFirstName = student.getFirstName();
        Assert.assertEquals(expectedFirstName, actualFirstName);
    }


    @Test
    public void getLastNameTest() {

        Student student = new Student(null, "Santana", null);
        String expectedLastName = "Santana";
        String actualLastName = student.getLastName();
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void getNumberOfExamsTakenTest() {
        Student student = new Student(null, null, null);
        ArrayList<Double> examScoress = student.getExamScores();


    }


    @Test
    public void getExamScoresTest() {
        ArrayList<Double> examScoress = new ArrayList<Double>(Arrays.asList(90.0, 76.0, 89.0));
        Student student = new Student(null, null, examScoress);
        ArrayList expectedExamScoress = new ArrayList<Double>(Arrays.asList(90.0, 76.0, 89.0));
        ArrayList actualExamSocoress = examScoress;
        Assert.assertEquals(expectedExamScoress, actualExamSocoress);


    }


    @Test
    public void getAverageExamScoreTest() {
        ArrayList<Double> examScoress = new ArrayList<Double>(Arrays.asList(90.0, 76.0, 89.0));
        Student student = new Student(null, null, examScoress);
        Double expectedAverageExamScore = 85.0;
        Double actualAverageExamScore = student.getAverageExamScore();
        Assert.assertEquals(expectedAverageExamScore, actualAverageExamScore);

    }


}
