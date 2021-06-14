/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex24;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        readInput();

        boolean result = isAnagram(word1, word2);

        String output = giveResult(result);

        System.out.println(output);
    }

    public static void readInput() {
        System.out.print("Enter the first string: ");
        word1 = in.next();

        System.out.print("Enter the second string: ");
        word2 = in.next();
    }

    static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static String giveResult(boolean isAnagram) {
        String output;
        if(isAnagram) {
            output = "is anagram";
        } else {
            output = "is not anagram";
        }
        return output;
    }
}