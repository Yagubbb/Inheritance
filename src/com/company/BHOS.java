package com.company;

public class BHOS extends University {
    private int numOfCampuses = 2;
    public BHOS(String name,String address, String faculties, int educationYear, int payment) {
        super(name,address, faculties, educationYear, payment);

    }

    public int getNumOfCampuses() {
        return numOfCampuses;
    }



    public void setNumOfCampuses(int numOfCampuses) {
        this.numOfCampuses = numOfCampuses;
    }






}
