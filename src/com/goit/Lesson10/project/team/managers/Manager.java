package com.goit.Lesson10.project.team.managers;

import com.goit.Lesson10.project.team.ProjectMember;

import java.util.Date;

/**
 * Created by 1 on 01.06.2015.
 */
public abstract class Manager extends ProjectMember {

    public Manager(String name, String position, double salary) {
        super(name, position, salary);
    }

    public abstract void manageRequirements(String requirements);
}
