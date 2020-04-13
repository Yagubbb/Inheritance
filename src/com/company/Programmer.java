package com.company;

public class Programmer extends Person {
    Job job;
    Computer comp;
    University university;

    public Programmer(String name, String surname, int age,Job job,Computer comp,University university) {
        super(name, surname, age);
        this.job = job;
        this.comp =comp;
        this.university = university;
    }


    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Computer getComp() {
        return comp;
    }

    public Job getJob() {
        return job;
    }

    public University getUniversity() {
        return university;
    }



    public void about(){
        System.out.println("Full name: " + getName() +" " + getSurname());
        System.out.println("Job: Programmer" );
        System.out.println("Work hours and place: " + Integer.toString(job.getWorkHours()) + " in " +  job.getWorkPlace());
        System.out.println("Salary: " + job.getSalary());
        System.out.println("Skills: " + job.getSkills());
        System.out.println("Finished University: " + university.getName());
        System.out.println();

    }


}
