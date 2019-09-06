package com.java.beersong;

public class Main {

    public static void main(String[] args) {
        int pizzaNum = 99;
        String word = "slices";

        while (pizzaNum > 0){
            if (pizzaNum == 1){
                word = "slice"; // singular, as in ONE bottle
            }
            System.out.println (pizzaNum + " " + word + " of pizza on the wall");
            System.out.println (pizzaNum + " " + word + " of pizza");
            System.out.println ("Take one down");
            System.out.println ("Pass it around");
            pizzaNum = pizzaNum - 1;

            if (pizzaNum > 0){
                System.out.println (pizzaNum + " " + word + "of pizza on the wall");
            } else {
                System.out.println ("No more slices of pizza on the wall");
            } // end else
        } // end while loop

    } // end main method
} // end class
