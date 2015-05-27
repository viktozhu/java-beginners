package com.goit.Lesson9;

/**
 * Created by 1 on 27.05.2015.
 */
public class Main {
    public static void main(String[] args){
        Student student = new Student("Egor", "GoIt");

        student.setResponse("this is correct response");
        String response = student.getResponse("What is class?");
        System.out.println(response);

        Teacher teacher = new Teacher("Ivan","GoIt");
        teacher.getResponse("What is polymorphism?");
    }
}
