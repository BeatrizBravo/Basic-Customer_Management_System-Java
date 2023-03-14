package com.mySchool;

public class Main {
    public static void main(String[] args) {
        //Crear 3 alumnos con sus respectivos nombres y edad.
       Student one = new Student("Hoye",20);
       Student two = new Student("Pep",100);
       Student three = new Student("Plop",80);

       //after we instant the object Student we can use all its methods
        //Para cada alumno establecer sus asignaturas y la nota obtenida.
        one.addSubjectToCurriculum(new Subject("Contract law", 5.6));
        one.addSubjectToCurriculum(new Subject("Criminal  law", 6.6));
        one.addSubjectToCurriculum(new Subject("European Union law", 9.6));

        two.addSubjectToCurriculum(new Subject("Contract law", 5.6));
        two.addSubjectToCurriculum(new Subject("Criminal  law", 6.6));
        two.addSubjectToCurriculum(new Subject("European Union law", 9.6));


        three.addSubjectToCurriculum(new Subject("Contract law", 5.6));
        three.addSubjectToCurriculum(new Subject("Criminal  law", 6.6));
        three.addSubjectToCurriculum(new Subject("European Union law", 9.6));
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);



    }
}
