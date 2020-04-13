package com.company;

public class Main {

    public static void main(String[] args) {
        Person John = new Person("John","Stone", 25);
        HP hp15t =  new HP("Laptop","HP","Intel Core I7,10th gen",15.6,12);

        BHOS BhosCampus = new BHOS("Baku Higher Oil School","Bibiheybat","Chemical Engineering ,"
                 + "Processes Engineering , Information Security ,Petroleum Engineering", 4,4500);

        Programmer programmer = new Programmer(John,10,2000,"Office","Java knowledge",hp15t,BhosCampus);

        programmer.about();
        programmer.getUniversity().about();
        programmer.getComp().properties();


    }
}
