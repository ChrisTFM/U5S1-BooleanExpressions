package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static String oddEven(int numb){
        String response = "";
        if (numb % 2 == 0) {
            response = "The num " + String.valueOf(numb) + " is even.";
        }
        else {
            response = "The num " + String.valueOf(numb) + " is odd.";
        }

        return response;
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();

        System.out.println(oddEven(num));

    }
}
