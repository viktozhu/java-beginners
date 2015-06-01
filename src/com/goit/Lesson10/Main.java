package com.goit.Lesson10;

import com.goit.Lesson10.project.team.ProjectMember;
import com.goit.Lesson10.project.team.managers.ProjectManager;

/**
 * Created by 1 on 01.06.2015.
 */
public class Main {

    public static void main(String[] args){
        ProjectMember pm = new ProjectManager("Vasia","Delivery Manager",3000);
        pm.work();
    }
}
