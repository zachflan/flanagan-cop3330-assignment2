/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex28;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    private static int sum;

    public static void main(String[] args) {

        int total;

        total = takeInput();

        output(total);
    }

    public static int takeInput() {

        int input = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            input = in.nextInt();
            sum = sum + input;
        }
        return sum;
    }

    public static void output(int totalAmount) {

        System.out.print("The total is " + totalAmount + ".");
    }
}
