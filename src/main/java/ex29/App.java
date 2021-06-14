/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex29;

import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    //private static int ror = 0;

    public static void main(String[] args) {

        int yesRor, yearsTotal;

        yesRor = takeInput();

        yearsTotal = rorCalc(yesRor);

        System.out.print("It will take " + yearsTotal + " years to double your initial investment.");
    }

    public static int takeInput() {
        boolean isNumber;
        int ror = 1;

        while (isNumber = true) {
            System.out.print("What is the rate of return? ");
            if (in.hasNextInt()) {
                ror = in.nextInt();
                if (ror != 0) {
                    isNumber = false;
                    break;
                } else {
                    System.out.println("You have entered 0. Try again.");
                }
            } else {
                System.out.println("Sorry. That's not a valid input.");
                in.next();
            }
        }
        return ror;
    }

    public static int rorCalc(int ror) {

        int years;
        years = 72 / ror;

        return years;
    }
}
