package com.company;

public class Programmer extends Job {
    Person person;
    Computer comp;
    University university;

    public Programmer(Person person,int workHours, int salary, String workPlace, String skills,Computer comp,University  university) {
        super(workHours, salary, workPlace, skills);
        this.person = person;
        this.comp = comp;
        this.university = university;

    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Computer getComp() {
        return comp;
    }

    public Person getPerson() {
        return person;
    }

    public University getUniversity() {
        return university;
    }



    public void about(){
        System.out.println("Full name: " + person.getName() +" " + person.getSurname());
        System.out.println("Job: " + getName() );
        System.out.println("Work hours and place: " + Integer.toString(getWorkHours()) + " " +  getWorkPlace());
        System.out.println("Salary: " + getSalary());
        System.out.println("Skills: " + getSkills());
        System.out.println("Finished University: " + university.getName());
        System.out.println();

    }
    public String getName(){
        return "Programmer";
    }

}
