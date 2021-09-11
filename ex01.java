/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Radney
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scnr = new java.util.Scanner(System.in);
        var name = "";

        System.out.print("What is your name? ");
        name = scnr.nextLine();
        System.out.print("Hello, " + name + ", nice to meet you!");
    }
}