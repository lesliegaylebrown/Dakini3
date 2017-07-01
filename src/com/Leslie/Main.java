package com.Leslie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create Scanner object
        Scanner scnr = new Scanner(System.in);
        // Output the prompt
        System.out.println("Enter some number");
        // wait for the user to enter an iteger
        int userNum = scnr.nextInt();

        // create temp variable for operations on userNum
        int temp = userNum;

        int remain, sum = 0;

        // while loop isolates each digit of userNum and cubes each
        while (userNum > 0) {

            remain = userNum % 10;
            userNum = userNum / 10;
            sum = sum + (remain * remain * remain);
        }
        // if else tests temp == sum and outputs the correct string
        if (temp == sum)
            System.out.println("True,this number passed the test");
        else
            System.out.println("False, this number failed the test");

    }

}
