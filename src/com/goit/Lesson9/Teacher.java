package com.goit.Lesson9;

/**
 * Created by 1 on 27.05.2015.
 */
public class Teacher extends Person {
    private String university;
    private String response;


    public Teacher(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getResponse(String question){
        printOnTable();
        return response;
    }

    private void printOnTable(){
        System.out.println("Assume this is table )):"+response);
    }
}
