package com.codedifferently.labs.partB.ex03;
import java.util.Scanner;

public class IfElseNameCheck {
    public static String nameCheck(String name){
        String response = "";
        /* Put your code in between these comments : Top */

        if (name.equals("Elvis")) {
            response = "You are the king of rock and roll";
        }
        else { response = "You're not the king"; }


        /* Put your code in between these comments : Bottom */

        return response;

    }

    public static void main(String args[]) {
        String name = "";
        /* Put your code in between these comments : Top */

        System.out.println("Input your fist name");

        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        /* Put your code in between these comments : Bottom */


        String responseToName  = nameCheck(name);
        System.out.println(responseToName);
    }

}
