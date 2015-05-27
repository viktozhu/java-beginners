package com.goit.Lesson9;

/**
 * Created by 1 on 27.05.2015.
 */
public class Student extends Person{ //class name
    public String university;


    public Student(String name, String university){ // constructor
        super(name); // call super class constructor
        this.university = university; // extend with new properties
    }


    private String response;

    public String getResponse(String question){ // method
        if ((question != null) && (!question.equals("")))
            return response;
        else
            return "There was no question";
    }

    public void setResponse(String response){
        this.response = response;
    }
}
