package com.company;

public class University {
    private String name;
    private String address;
    private String faculties;
    private int educationYear,payment;

    public University(String name,String adress, String faculties, int educationYear, int payment) {
        this.name = name;
        this.address = adress;
        this.faculties = faculties;
        this.educationYear = educationYear;
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }


    public String getFaculties() {
        return faculties;
    }

    public void setFaculties(String faculties) {
        this.faculties = faculties;
    }

    public int getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }
    public void about(){
        System.out.println("Name: " + getName());
        System.out.println("Faculties: "  + faculties);
        System.out.println("Education year(without foundation)" + getEducationYear());
        System.out.println("Payment(paid): " + getPayment());
        System.out.println("");
        System.out.println("");
    }
}
