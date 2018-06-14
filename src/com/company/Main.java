package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        MovieList ml = new MovieList();
        while (quit == false) {

            System.out.println(" please enter movie name:");
            String movieName = sc.next();

            System.out.println(" please enter movie year: ");
            int year = sc.nextInt();
            Movie mov = new Movie(movieName, year);

            ml.add(mov);




            System.out.println("Do you want to add more movies? (Y/N): ");
            String ans = sc.next();

            if (!ans.equalsIgnoreCase("n")) {

               quit = false;
            } else {


                quit = true;
            }

        }
        System.out.println(ml.print());


    }
}
