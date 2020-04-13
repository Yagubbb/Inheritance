package com.company;

public class Computer {
    private String type,model,processor;
    private double size;
    private int ram;

    public Computer(String type, String model, String processor, double size, int ram) {
        this.type = type;
        this.model = model;
        this.processor = processor;
        this.size = size;
        this.ram = ram;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public double getSize() {
        return size;
    }

    public int getRam() {
        return ram;
    }
    public void properties(){

        System.out.println("Type: " + getType());
        System.out.println("Size(inches): " + getSize() );
        System.out.println("Technical properties: " + getModel() + ", " + getProcessor() + ", " + getRam() + "RAM");

    }
}
