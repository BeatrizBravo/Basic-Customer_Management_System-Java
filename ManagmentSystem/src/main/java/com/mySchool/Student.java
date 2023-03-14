package com.mySchool;

import java.util.ArrayList;

public class Student {
    private String NameStudent;
    private int ageStudent;

    private ArrayList<Subject> ListOfSubjectFromStudent = new ArrayList<>();
    // no sabemos que ni cuantas materias el studiante tomara
    //oop we create our own type of data, clase Subject, tienen dos atributos con su propio tipo


    public Student(String nameStudent, int ageStudent) {
        NameStudent = nameStudent;
        this.ageStudent = ageStudent;
    }

    public String getNameStudent() {
        return NameStudent;
    }

    public void setNameStudent(String nameStudent) {
        NameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public double getAverageScore(){
            /*After we create the ArrayList with the type Suject we can use its atribute to do operations*/

        double sumOfAllScore = 0;
        for(Subject i :ListOfSubjectFromStudent.){  // le pasamos el tipo de subject con la variable i
            sumOfAllScore += i.getScoreSubject();

            return sumOfAllScore/ListOfSubjectFromStudent.size();
        }

    }


        //le pasamos el objeto Subject con el atributo de esa clase que vamos a comparar
    public void addSubjectToCurriculum(Subject nameSubject){
        /*Método para agregar una Asignatura a su plan de estudio;
        verificar que la asignatura no exista previamente las asignaturas de ese Alumno.*/
        if (ListOfSubjectFromStudent.contains(nameSubject)) {
            System.out.println("That subject already exist");
        }else{
            ListOfSubjectFromStudent.add(nameSubject);
        }

    }
}
