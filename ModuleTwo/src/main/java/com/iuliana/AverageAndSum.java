package com.iuliana;

/**
 * @author Iuliana
 */
/*
Write a program that will calculate the average and sum of
all numbers between the range of 2 numbers.
For example, for range numbers 1 to 100 output should be:
Sum for range 1 to 100 : 5050
Average for range 1 to 100 : 50.5*/

public class AverageAndSum {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 100;
        int sum = sum(numberOne, numberTwo);
        System.out.println("Sum for range 1 to 100: "+ sum);
        int numberOfNumbers = numberTwo - numberOne + 1;
        System.out.println("Average is: " + average(sum, numberOfNumbers));

    }

    public static int sum(int numberOne, int numberTwo) {
        int sum = 0;
        for (int index = numberOne; index <= numberTwo; index++) {
            sum += index;
        }
        return sum;
    }

    public static float average(int sum, int numberOfNumbers) {
        return (float) sum / numberOfNumbers;
    }
}
