package com.mySchool;

public class Subject {

    private String nameSubject;
    private double scoreSubject;

        //Constructor
        // The atributes declare a nivel of the Class are going be modificate
        // this variables, we declare are going be equal to the value we introduce in this level
    // the method is publico y podemos acceder
    public Subject(String nameSubject, double scoreSubject) {
        this.nameSubject = nameSubject;
        this.scoreSubject = scoreSubject;
    }

    //get and setter methods
    // they allow to access and modificate the values


    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public double getScoreSubject() {
        return scoreSubject;
    }

    public void setScoreSubject(double scoreSubject) {
        this.scoreSubject = scoreSubject;
    }

    // methods return if the student has pass or fail
    public String getPassSubject(){
        if (scoreSubject > 4) {
            return "Pass";

        }else return "Fail";
    }

}
