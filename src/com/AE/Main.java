package com.AE;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int newScore = calculateScore("Angel", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double feetAndInchesToCentimeters = calcFeetAndInchesToCentimeters(6, 12);
        System.out.println(feetAndInchesToCentimeters);
        feetAndInchesToCentimeters = calcFeetAndInchesToCentimeters(10);
        System.out.println(feetAndInchesToCentimeters);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed Player scored no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {

            double centimeters = ((12 * feet) + inches) * 2.54;
            System.out.println(feet + "ft plus " + inches + "in is equal to " + centimeters + "cm.");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ((inches >= 0) && (inches <= 12)) {
            double centimeters = inches * 2.54;
            System.out.println(inches + "in is equal to " + centimeters + "cm.");
            return centimeters;
        } else if (inches > 12) {
            double feet = (int) inches / 12;
            double remainingInches = inches % 12;
            System.out.println(inches + "in is equal to " + feet + "ft and " + remainingInches + "in. ");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);

        } else {
            System.out.println("Invalid inches");
            return -1;
        }
    }


}



