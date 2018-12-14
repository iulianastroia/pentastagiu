package com.iuliana;

/**
 * @author Iuliana
 */


//Write a program that will sum up all numbers from 0 up to a target number.
// For example, for an input number 5, result should be 15 (0+1+2+3+4+5)


public class SumOfNumbers {
    public static void main(String[] args) {
        int targetNumber = 5;
        System.out.println("Sum of numbers is "+sum(targetNumber));
    }

    public static int sum(int targetNumber) {
        int sum = 0;
        for (int index = 0; index <= 5; index++) {
            sum += index;
        }
        return sum;
    }
}
