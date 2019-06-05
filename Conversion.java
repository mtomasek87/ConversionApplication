package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

class Conversion {


    Conversion() {
    }

    void convertKgToLbsAndStones() {
        try {
            System.out.println("Enter a number to convert: ");
            Scanner scanner = new Scanner(System.in);
            double number;
            number = scanner.nextDouble();
            double result;
            double result2;
            result = number * 2.2046;
            result2 = number * 0.15747;
            System.out.println(number + " kilograms is " + result + " pounds.");
            System.out.println(number + " kilograms is " + result2 + " stones.");
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
        }

    }


    void convertLbsToKgAndStones() {
        try {
            System.out.println("Enter a number to convert: ");
            Scanner scanner = new Scanner(System.in);
            double number;
            number = scanner.nextDouble();
            double result;
            double result2;
            result = number / 2.2046;
            result2 = number * 0.071429;
            System.out.println(number + " pounds is " + result + " kilograms.");
            System.out.println(number + " pounds is " + result2 + " stones.");
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
        }

    }

    void convertStonesToKgAndLbs() {
        try {
            System.out.println("Enter a number to convert: ");
            Scanner scanner = new Scanner(System.in);
            double number;
            number = scanner.nextDouble();
            double result;
            double result2;
            result = number / 0.15747;
            result2 = number * 14.000;
            System.out.println(number + " stones is " + result + " kilograms.");
            System.out.println(number + " stones is " + result2 + " pounds.");
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input.");
        }


    }
}
