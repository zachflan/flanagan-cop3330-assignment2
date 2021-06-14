/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static final Scanner in = new Scanner(System.in);

    private static int restingHR;
    private static int age;

    public static void main(String[] args) {

        takeInput();

        chart();

    }

    public static void takeInput() {
        System.out.print("Resting Pulse: ");
        if (in.hasNextInt()){
            restingHR = in.nextInt();
        } else {
            System.out.print("That is not a number.");
            System.exit(0);
        }


        System.out.print("Age: ");

        if (in.hasNextInt()){
            age = in.nextInt();
        } else {
            System.out.print("That is not a number.");
            System.exit(0);
        }

    }

    public static void chart() {

        int TargetHeartRate;
        int intensity = 55;
        double targReturn;

        System.out.format("Intensity    | Rate\n");
        System.out.format("-------------|--------\n");
        for(int i = intensity; i <= 95; i += 5){
            double i2 = i;
            targReturn = targetHeartCalc(i2);
            System.out.format("%d%%          | %.0f bpm\n", i, targReturn);
        }

    }

    public static double targetHeartCalc(double intensity) {

        double TargetHeartRate1, TargetHeartRate2, TargetHeartRate3, TargetHeartRate4, intensity2;
        TargetHeartRate1 = (220 - age);
        TargetHeartRate2 = TargetHeartRate1 - restingHR;
        intensity2 = intensity / 100;
        TargetHeartRate3 = TargetHeartRate2 * intensity2;
        TargetHeartRate4 = TargetHeartRate3 + restingHR;
        return TargetHeartRate4;
    }
}
