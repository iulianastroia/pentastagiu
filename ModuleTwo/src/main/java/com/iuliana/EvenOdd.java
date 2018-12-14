package com.iuliana;

/**
 * @author Iuliana
 */

/*
Write a Java program to find the number of even and odd integers in a given array of integers

For example.
Given the following array [13,20,14,5,2,8] the output should be:

Odd elements count : 2
Even elements count : 4
*/
public class EvenOdd {
    public static void main(String args[]) {
        int[] array = {13, 20, 14, 5, 2, 8};
        int odd = 0, even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even += 1;
            else
                odd += 1;
        }

        System.out.println("Odd elements count: " + odd);
        System.out.println("Even elements count: " + even);
    }

}
