package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare Variables
        Scanner input = new Scanner(System.in);
        String card1;
        String card2;
        int result;
        int num;

        System.out.print("Please enter two card numbers: ");
        card1 = input.next();
        card2 = input.next();

       result = cardSum(card1, card2);

       if(result == 21){
           System.out.println( result +"*");
       }
       else{
           System.out.println( result);
       }

    }

    public static int differentiate(String n){
        int num1;

        if (n.equalsIgnoreCase("J") || n.equalsIgnoreCase("Q") ||
                n.equalsIgnoreCase("K") || n.equalsIgnoreCase("A")) {

            num1 = faceCard(n);
        } else {

            num1 = Integer.parseInt(n);
        }
        return num1;
    }

    public static int cardSum(String m, String n) {
        int num = 0;
        int num1 = 0;

    //For the first card
        num = differentiate(m);

     //For the second card
        num1 = differentiate(n);

    // Return statement for the two cards
        return (num + num1);
    }

        public static int faceCard(String m){
            int numForFace = 0;
            String k;

            k = m.toUpperCase();

            switch (k) {
                case "J":
                    numForFace = 11;
                    break;
                case "Q":
                    numForFace = 12;
                    break;
                case "K":
                    numForFace = 13;
                    break;
                case "A":
                    numForFace = 14;
                    break;
            }
            return numForFace;

        }

}
