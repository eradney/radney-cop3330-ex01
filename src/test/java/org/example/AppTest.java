package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Radney
 */

public class AppTest {
    public static void main(String[] args) {
        Scanner scnr = new java.util.Scanner(System.in);
        String name;

        System.out.print("What is your name? ");
        name = scnr.nextLine();
        System.out.print("Hello, " + name + ", nice to meet you!");
    }
}