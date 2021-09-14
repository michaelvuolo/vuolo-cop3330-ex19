/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // record choice
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" + "Press F to convert from Celsius to Fahrenheit.");

        // output choice
        System.out.print("Your choice: ");
        String choice = input.nextLine();

        // cont. based on choice
        if (choice.equalsIgnoreCase("F")) {
            // record celsius temperature
            System.out.print("Please enter the temperature in Celsius: ");
            double temperature_celsius = input.nextDouble();
            double converted_temperature_fahrenheit = (temperature_celsius * 9 / 5) + 32;

            // output temperature
            System.out.print("The temperature is " + String.format("%.0f", converted_temperature_fahrenheit));
        } else if (choice.equalsIgnoreCase("C")) {
            // record fahrenheit temperature
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temperature_fahrenheit = input.nextDouble();
            double converted_temperature_celsius = (temperature_fahrenheit - 32) * 5 / 9;

            // output temperature
            System.out.print("The temperature is " + String.format("%.0f", converted_temperature_celsius));
        }
    }
}
