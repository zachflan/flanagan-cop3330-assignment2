/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex32;


import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int randNum;
        String playAgainChoice;
        Games game = new Games();

        randNum = takeInput();

        takeGuesses(randNum);

        playAgainChoice = playagain();


        if(playAgainChoice.equals("y")){
            System.out.println("");
            randNum = takeInput();
            takeGuesses(randNum);
            playAgainChoice = playagain();
        } else {
            System.out.println("AHH");
            System.exit(0);
        }
    }

    public static int takeInput() {

        int diffLevel, pickedNum;

        System.out.println("Let's play Guess the Number!");
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        diffLevel = in.nextInt();

        if (diffLevel == 1) {
            pickedNum = Games.diff1();
        } else if (diffLevel == 2) {
            pickedNum = Games.diff2();
        } else {
            pickedNum = Games.diff3();
        }
        return pickedNum;
    }

    public static void takeGuesses(int randNum) {
        int guess;
        boolean isNumber;
        int temp = 1;
        int attempts = 1;
        System.out.print("I have my number. What's your guess? ");

        while(true){
            do {
            if (in.hasNextInt()) {
                temp = in.nextInt();
                isNumber = true;
            } else {
                System.out.print("That is not a number. Guess again:");
                isNumber = false;
                attempts++;
                in.next();
            }
        } while (!(isNumber));
                if (temp > randNum) {
                    System.out.print("Too high. Guess again: ");
                    attempts++;
                } else if (temp < randNum) {
                    System.out.print("Too low. Guess again: ");
                    attempts++;
                } else {
                    System.out.print("You got it in " + attempts + " guesses!");
                    break;
                }
            }
         }

    public static String playagain() {

        System.out.println("\n\nDo you wish to play again (Y/N)? ");

        Scanner in2 = new Scanner(System.in);
        String playAgain = in2.nextLine();

        return playAgain;
    }
}

