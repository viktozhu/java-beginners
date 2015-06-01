package com.goit.Lesson10.project.team.managers;

import java.util.Date;

/**
 * Created by 1 on 01.06.2015.
 */
public class ProjectManager extends Manager{
    //manager remember project dates and could change them when needed
    protected Date[] projectDates;

    public ProjectManager(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public void manageRequirements(String requirements) {
        // manage requirements in terms of project resources
    }

    // do planning, monitoring and control
    protected void plan(){
    }
    protected void monitor(){
    }
    protected void control(){
    }

    @Override
    public void work() {
        //do some project manager work
    }
}
