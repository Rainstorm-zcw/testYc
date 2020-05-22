package com.example.testyc.persistence.entity;

import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;


public class User implements Comparator {

    private String code;

    private String name;

    private Integer age;

    private String PROVINCE;

    private String CITY;

    private List<User> projects;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        add();
        return Objects.equals(code, user.code) &&
                Objects.equals(name, user.name) &&
                Objects.equals(age, user.age) &&
                Objects.equals(PROVINCE, user.PROVINCE) &&
                Objects.equals(CITY, user.CITY) &&
                Objects.equals(projects, user.projects);
    }

    int num=1;

    synchronized void add(){

         new Thread(() -> {
             num++;
             System.out.println(Thread.currentThread().getName());

         }).start();
         System.out.println("测试"+num);
        //写一个触发任务，加上多线程判断存数据库的值有多少
        //having count(1)>3 表示并发了


    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, age, PROVINCE, CITY, projects);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public List<User> getProjects() {
        return projects;
    }

    public void setProjects(List<User> projects) {
        this.projects = projects;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
