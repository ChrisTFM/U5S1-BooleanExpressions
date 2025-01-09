package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;


/*If input is less than or equal to 45 - "It's cold - putting on a coat!"
If input is greater than or equal to 46 and less than or equal to 65 - "It's not bad out - a hoodie will do just fine!"
Any other situation, - "It's hot - a T shirt will be perfect."
       */
public class TempCheck {

    public static String bool(){
        String response = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number from 0 to 100");
        int input = scan.nextInt();

        if (input <= 45) {
            response = "It's cold try putting on a coat!";
        }
        else if (input >= 46 && input <= 65) {
            response = "It's not bad out - a hoodie will do just fine!";
        }
        else {
            response = "It's hot - a T shirt will be perfect.";
        }

        return response;
    }
    public static void main(String args[]) {
        String booleanOutput = bool();
        System.out.println(booleanOutput);
    }
}
