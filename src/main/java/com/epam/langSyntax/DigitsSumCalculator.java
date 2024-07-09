package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        int sum = thousands + hundreds + tens + ones;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSumCalculator calculator = new DigitsSumCalculator();
        calculator.calculateSum(1234); // Example usage
    }
}
