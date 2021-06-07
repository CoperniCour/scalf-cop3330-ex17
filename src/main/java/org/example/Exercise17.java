/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 17 - Blood Alcohol Calculator

package org.example;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        //fyi this is not very inclusive of other aspects/genders, you should remove this from curriculum
        Scanner getNumbers = new Scanner(System.in);

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int biological_sex = getNumbers.nextInt();

        System.out.print("How many ounces of alcohol did you have? ");
        int ounces_drank = getNumbers.nextInt();

        System.out.print("What is your weight, in pounds? ");
        int weight = getNumbers.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int hours_since = getNumbers.nextInt();

        //Change r based on biological sex
        final double dist_ratio = biological_sex==2
                ? 0.66
                : 0.73;

        //calculate blood alcohol content
        double x = 5.14 / weight;
        double y = 0.015 * hours_since;
        double bac = (ounces_drank * dist_ratio * x) - y;

        //Print out BAC of user
        System.out.println(String.format("Your BAC is %.06f", bac));


        //Ternary operator to check conditions
        final String msg = bac > 0.08
                ? "It is not legal for you to drive."
                : "It is legal for you to drive.";
        System.out.println(msg);

    }
}
