package com.mySchool;

public class Subject {

    private String name;
    private double score;

        //Constructor
        // The atributes declare a nivel of the Class are going be modificate
        // this variables, we declare are going be equal to the value we introduce in this level
    // the method is publico y podemos acceder
    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }

    //get and setter methods
    // they allow to access and modificate the values
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // methods return if the student has pass or fail
    public String getPass(){
        if (score == 5) {
            return "Pass";

        }else return "Fail";
    }

}
