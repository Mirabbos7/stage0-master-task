package com.epam.OOP;

import java.sql.SQLOutput;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public void getDescription(){
        if(hasFur){
            System.out.println("This animal has mostly " + color + ". It has " + numberOfPaws + "paws and a fur.");
        } else {
            System.out.println("This animal has mostly " + color + ". It has " + numberOfPaws + "paws and no fur.");
        }

    }

}
