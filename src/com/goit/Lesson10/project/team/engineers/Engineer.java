package com.goit.Lesson10.project.team.engineers;

import com.goit.Lesson10.project.team.ProjectMember;

/**
 * Created by 1 on 01.06.2015.
 */
public abstract class Engineer extends ProjectMember {
    protected String programmingLanguage;

    public Engineer(String name, String position, double salary) {
        super(name, position, salary);
    }
}
