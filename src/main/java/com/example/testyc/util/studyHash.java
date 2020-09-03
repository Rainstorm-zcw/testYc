package com.example.testyc.util;

import com.example.testyc.persistence.entity.User;
import lombok.Data;

import java.util.Arrays;

public class studyHash {


    public static void main(String[] args) {
        User project1 = new User();
        User project2 = new User();
        User project3 = new User();
       project1.setProjects(Arrays.asList(project2));
         project2.setProjects(Arrays.asList(project3));
        project3.setProjects(Arrays.asList(project1));
        System.out.println(project1.equals(project2));
    }
}
