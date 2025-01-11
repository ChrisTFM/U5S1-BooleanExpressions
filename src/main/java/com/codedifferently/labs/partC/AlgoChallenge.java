package com.codedifferently.labs.partC;

public class AlgoChallenge {

    public static void main(String[] args){
        System.out.println(startWithIx("Risk")); //Mix
        System.out.println(near10(10, 10));
    }
      /* Problem 1
    Your local rapper is looking to create his next hook for his next track. He wants to add phrases that begin with "mix".
    But he decides he wants to take it a step further and accept any phrase except the "m" can be any letter or number.
    He needs your help to make sure the list of given phrases begin with what was asked.
    Return true if the given phrase begins with "mix", or any beginning letter or number following "ix"
    startWithIx("mix snacks") --> true
    startWithIx("pix snacks") --> true
    startWithIx("piz snacks") --> false
     */

    public static Boolean startWithIx(String phrase) {
        Boolean response = false;

        if (phrase.contains("ix")) {response = true;}
        else {response = false;}
        //System.out.println(phrase.indexOf("ix"));

        return response;
    }

     /* Problem 1
    Provide two numbers, evaluate both numbers to see which one is nearest to the value 10.
    Some numbers may have the same range in how near they are to 10; such as 13 and 7 both are 3 from 10;
    In that case, we would consider that event a tie.
    Tip: Math.abs(n) returns the absolute value of a number
    Return whichever number is nearest to 10, or return 0 for the event of a tie.
    near10(8, 13) --> 8
    near10(13, 8) --> 8
    near10(13, 7) --> 0
     */

    public static Integer near10(int one, int two){

        int one_sum = one - 10;
        int two_sum = two - 10;
        if (one_sum < 0) {one_sum = one_sum * -1;}
        if (two_sum < 0) {one_sum = one_sum * -1;}

        //System.out.println(one_sum);
        //System.out.println(two_sum);

        if (one_sum == two_sum) {return 0;}
        else if (one_sum < two_sum) {return one;}
        else {return two;}



    }

}
