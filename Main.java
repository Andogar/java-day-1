package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        String userNum1 = userInput.next();

        System.out.println("Enter your second number: ");
        String userNum2 = userInput.next();

        Double operand1 = Double.parseDouble(userNum1);
        Double operand2 = Double.parseDouble(userNum2);

        Double sum = operand1 + operand2;
        Double difference = operand1 - operand2;
        Double division = operand1 / operand2;
        Double multiplication = operand1 * operand2;
        Double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);
    }

    public static void showResults(Double sum, Double difference, Double division, Double multiplication, Double remainder) {
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The division is: " + division);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The remainder is: " + remainder);
    }
}
