/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex30;

public class App {

    public static void main(String[] args) {

        welcome();

        printMultiplicationTable();

    }

    public static void welcome() {
        System.out.println("Welcome! This is the multiplication table:");
    }

    public static void printMultiplicationTable() {

        int max = 12;

        for(int i = 1; i <= max; i++){
            for(int j = 1; j <= max; j++){
                System.out.format("%4d", (i * j));
            }
            System.out.format("\n");
        }
    }

}
