package Exercise4;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Bernard Fonrose
 */

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){

        Scanner MadLib = new Scanner(System.in);

        System.out.print("Enter a noun:");

        String noun = MadLib.nextLine();

        System.out.print("Enter a verb:");

        String verb = MadLib.nextLine();

        System.out.print("Enter an adjective:");

        String adjective = MadLib.nextLine();

        System.out.print("Enter an adverb:");

        String adverb = MadLib.nextLine();

        String mad_lib = String.format("Do you %s your %s %s %s", verb, noun, adjective, adverb);

        System.out.printf("%s", mad_lib);




    }
}