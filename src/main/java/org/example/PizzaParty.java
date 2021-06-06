/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {

        Scanner getPeople = new Scanner(System.in);
        Scanner getPizza = new Scanner(System.in);
        Scanner getSlices = new Scanner(System.in);

        System.out.print("How many people? ");
        Integer people = getPeople.nextInt();
        System.out.print("How many pizzas do you have? ");
        Integer pizza = getPizza.nextInt();
        System.out.print("How many slices per pizza? ");
        Integer slice = getSlices.nextInt();

        Integer total_slice = pizza * slice;

        //slices per person
        Integer spp = total_slice / people;

        // yay for forcing whole numbers and rounding down automatically we can use this logic
        Integer leftover = total_slice - (spp*people);

        System.out.println(String.format("%d people with %d pizzas (%d slices)", people, pizza, total_slice));
        System.out.println(String.format("Each person gets %d pieces of pizza",spp));
        System.out.println(String.format("There are %d leftover pieces.",leftover));
    }
}
