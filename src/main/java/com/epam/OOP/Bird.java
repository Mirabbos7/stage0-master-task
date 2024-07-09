package com.epam.OOP;

public class Bird extends Animal {
    // No-args constructor
    public Bird() {
        super("blue", 2, false);
    }

    // Override getDescription method
    @Override
    public String getDescription() {
        String baseDescription = super.getDescription();
        return baseDescription + " Moreover, it has 2 wings and can fly.";
    }
}
