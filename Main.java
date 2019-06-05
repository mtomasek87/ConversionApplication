package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conversion conversion = new Conversion();

        System.out.println("What do you want to convert?");
        System.out.println("1. kilograms >>> pounds, stones");
        System.out.println("2. pounds >>> kilograms, stones");
        System.out.println("3. stones >>> kilograms, pounds");
        System.out.println("Enter your choice:");

        int answer = scanner.nextInt();

        switch (answer) {
            case 1:
                conversion.convertKgToLbsAndStones();
                break;

            case 2:
                conversion.convertLbsToKgAndStones();
                break;

            case 3:
                conversion.convertStonesToKgAndLbs();
                break;

            default:
                System.out.println("Invalid input.");
                break;
        }




    }
}
