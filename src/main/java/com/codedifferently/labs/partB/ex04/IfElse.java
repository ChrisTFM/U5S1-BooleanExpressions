package com.codedifferently.labs.partB.ex04;

import java.util.Scanner;

public class IfElse {

    public static String equalToSeven(){
        Scanner scan = new Scanner(System.in);
        String response = "";
        /* Put your code in between these comments : Top */
        int input = scan.nextInt();

        if (input == 7) {
            response = "That's lucky!";
        }
        else {
            response = "That's unlucky!";
        }


        /* Put your code in between these comments : Bottom */


        return response;
    }
    public static void main(String[] args) {
        String luckyOutput = equalToSeven();
        System.out.println(luckyOutput);
    }
}
