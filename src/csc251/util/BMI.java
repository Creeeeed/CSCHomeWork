package csc251.util;


public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public static final double KILOGRAMS_PER_POUND = 0.453;

    public static final double METERS_PER_INCH = 0.0254;


    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}

