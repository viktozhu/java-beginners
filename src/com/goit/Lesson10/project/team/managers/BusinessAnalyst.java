package com.goit.Lesson10.project.team.managers;

/**
 * Created by 1 on 01.06.2015.
 */
public class BusinessAnalyst extends Manager{
    public BusinessAnalyst(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public void manageRequirements(String requirements) {
        //work with requirements, provide them to team
    }

    @Override
    public void work() {
        //do some business analyst work
    }
}
