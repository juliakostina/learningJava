package com.company;

/**
 * Created by techsupport on 15.10.14.
 */
public class BeerSong {

    public static void main(String[] args) {

        int BeerNum = 99;
        String word = "бутылок";

        while (BeerNum > 0) {
            if (BeerNum == 1)  {
                word = "бутылка";
            }
            else {
                word = "бутылок";
            }

//            System.out.println(BeerNum + " " + word + " пива на стене");
            System.out.println(BeerNum + " " + word + " пива.");
            System.out.print("Возьми одну!");
            System.out.println(" Пусти по кругу.");
            BeerNum = BeerNum - 1;
            if (BeerNum > 0) {
                System.out.println(BeerNum + " " + word + " пива на стене");

            }
           else {
                System.out.println("Нет бутылок пива на стене");
            }

        }

    }
}
