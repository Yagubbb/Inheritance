package com.company;

public class Job {
    private int workHours,salary;
    private String workPlace;
    private String skills;

    public Job(int workHours, int salary, String workPlace, String skills) {
        this.workHours = workHours;
        this.salary = salary;
        this.workPlace = workPlace;
        this.skills = skills;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkill(String skills) {
        this.skills = skills;
    }


}
