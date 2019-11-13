package io.zipcoder;

import java.util.ArrayList;
// this is a blueprint in case we want multiple students

public class Student implements Comparable<Student> {
 // declaring variables
 String firstName;
 String lastName;
 ArrayList<Double> examScores;




 public Student(String firstName, String lastName, ArrayList<Double> testScores) {

  this.firstName = firstName;
  this.lastName = lastName;
  // this converts an array to an arrayList
  this.examScores = testScores;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public int getNumberOfExamsTaken() {
  return examScores.size();
 }

 public ArrayList<Double> getExamScores() {
     return  examScores;
 }

 public String printExamScores() {
  String result = "Exam Scores:\n";

  for (int i = 0; i < examScores.size(); i++) {

   result += "\t" + "exam " + (i + 1) + "->" + Math.round(examScores.get(i));

   if (i != examScores.size() - 1) {

    result += "\n";
   }
  }
  return result;
 }


  public void addExamScore ( double examScore){
   examScores.add(examScore);

  }


 public  void setExamScore(int examNumber,double newScore){
  examScores.set(examNumber,newScore);

 }

 public Double getAverageExamScore(){
  Double sum = 0.0;

  for (int i =0 ; i < examScores.size(); i ++) {
   sum += examScores.get(i);

  }
  Double average = sum / examScores.size();

  return average;

 }

 @Override
 public String toString() {

     return "student name" + getFirstName() + " " + getLastName() + "\n" +
          "> Average Score: " + getAverageExamScore() +"\n" +
          "> Exam Scores: " + "\n" +
          printExamScores();
 }


 @Override

 public int compareTo (Student alumnis) {
    if(this.getAverageExamScore() < alumnis.getAverageExamScore()){
     return -1;
    } else if (this.getAverageExamScore() > alumnis.getAverageExamScore()){
     return 1;
    } else {
     return (this.firstName).compareTo(alumnis.firstName);
    }

 }
}