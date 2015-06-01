package com.goit.Lesson10.project.team;

/**
 * Created by 1 on 01.06.2015.
 */
public abstract class ProjectMember {
    private String name;
    private String position;
    // since name and position private, and there is no setter and getter they could not be changed
    // salary protected - its means that all classes inherits this class have access to salary, but only internal access
    protected double salary;

    public ProjectMember(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // method is abstract because every project member do some work, but each one is different
    public abstract void work();

    public void salaryReview(double newSalary){
        this.salary = newSalary;
    }
}
