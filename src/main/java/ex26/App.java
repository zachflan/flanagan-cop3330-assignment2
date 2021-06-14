/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex26;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    private static double monthsUntilPayed;
    private static double dailyRate;
    private static double balance;
    private static double monthlyPayment;
    private static double apr;

    public static void main(String[] args) {

        readInput();

        getDailyRate(apr);

        PaymentCalculator pc = new PaymentCalculator();
        //double result = pc.calculateMonthsUntilPaidOff(apr, balance, monthlyPayment);
        pc.calculateMonthsUntilPaidOff(apr, balance, monthlyPayment);
        //Double output = giveResult(result);

        //System.out.println("It will take you " + result + " months to pay off this card.");
    }

    public static void readInput() {
        System.out.print("What is your balance? ");
        balance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = in.nextDouble();
    }

    public static void getDailyRate(double apr){

        dailyRate = apr / 365;

    }

//    static boolean isAnagram(String string1, String string2) {
//        if (string1.length() != string2.length()) {
//            return false;
//        }
//        char[] a1 = string1.toCharArray();
//        char[] a2 = string2.toCharArray();
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//        return Arrays.equals(a1, a2);
//    }
//
//    public static double giveResult(double output) {
//
//
//
//
//        return output;
//    }
}