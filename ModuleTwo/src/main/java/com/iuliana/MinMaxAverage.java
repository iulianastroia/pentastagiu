package com.iuliana;

/**
 * @author Iuliana
 */

/*
Write a java program that will return the min, max and average values in a given array.

For example
GIven the following array [13,20,14,5,2,8] the output should be
Max : 20
Min : 2
Average: 10.3
*/

public class MinMaxAverage {
    public static void main(String args[]) {
        int[] array = {13, 20, 14, 5, 2, 8};
        System.out.println("Min: " + min(array));
        System.out.println("Max: " + max(array));
        System.out.println("Average: " + average(array));

    }

    public static int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum)
                minimum = array[i];
        }
        return minimum;
    }

    public static int max(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum)
                maximum = array[i];
        }
        return maximum;
    }

    public static float average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (float) sum / array.length;
    }
}
