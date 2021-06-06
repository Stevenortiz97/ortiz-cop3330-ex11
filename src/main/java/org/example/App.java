/*
 *  UCF COP3330 Summer 2021 Assignment 11
 *  Copyright 2021 Steven Ortiz
 */

//c_to / c_frame = rate
//How many euros are you exchanging? 81
//What is the exchange rate? 1.3751
//81 euros at an exchange rate of 1.3751 is
//111.38 U.S. dollars.

package org.example;

import java.util.Scanner;

import java.text.DecimalFormat;


public class App {

    static Scanner in = new Scanner(System.in);

    private static int euroint(){

        System.out.print("How many Euros are you exchanging? ");
        String euroinput = in.nextLine();
        return Integer.parseInt(euroinput);
    }

    private static double exchange(){

        System.out.print("What is the exchange rate ? ");
        String exhangerate = in.nextLine();
        return Double.parseDouble(exhangerate);
    }
    public static void main(String[] args) {

        int euroint = euroint();
        double exchange = exchange();

        System.out.println(+ euroint +" Euros at an exchange rate of "+ exchange +" is ");

        double US = (euroint * exchange) + 0.001;

        DecimalFormat format = new DecimalFormat("0.00");

        int  = (int) Math.ceil(US);

        System.out.print(format.format(US));

        System.out.print(" U.S. dollars.");
    }
}
