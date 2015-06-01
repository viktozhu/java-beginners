package com.goit.Lesson10.project.team.engineers;

/**
 * Created by 1 on 01.06.2015.
 */
public class Developer extends Engineer{
    public Developer(String name, String position, double salary, String programmingLanguage) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        // do some development work
    }
}
