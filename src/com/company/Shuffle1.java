package com.company;

/**
 * Created by techsupport on 21.10.14.
 */
public class Shuffle1 {


    public static void main(String[] args) {


        int x = 3;

        if (x > 2) {
            System.out.print("a");
        }

        while (x > 0) {

            x = x - 1;


            if (x == 1) {
                System.out.print(" - ");

            }

            if (x == 2) {
                System.out.print("b c");

            }
        }


    }


}
