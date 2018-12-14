package com.iuliana;

/**
 * @author Iuliana
 */

/*
Write a program that test whether 2 int arrays are equal.
Equality in this case means that both arrays have the same
number of elements an element on a specific index in first
array is equal to the element on the same index in the second array.

For example

For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
For the following arrays [] and [] the output should be TRUE
For the following arrays [1,3,2] and [1,3] the output should be FALSE
For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
*/


public class Equality {
    public static void main(String args[]) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {};
        int[] array4 = {};
        int[] array5 = {1, 2, 4, 3};
        int[] array6 = {1, 3, 2};
        int[] array7 = {1, 3};
        System.out.println("Test equality for {1, 2, 3, 4} and {1, 2, 3, 4}");
        testEquality(array1, array2);
        System.out.println("Test equality for [] and []");
        testEquality(array3, array4);
        System.out.println("Test equality for {1, 3, 2} and {1, 3}");
        testEquality(array6, array7);
        System.out.println("Test equality for {1, 2, 3, 4} and {1, 2, 4, 3}");
        testEquality(array1, array5);

    }

    public static void testEquality(int[] array1, int[] array2) {
        int arrayLength;
        if (array1.length < array2.length)
            arrayLength = array1.length;
        else
            arrayLength = array2.length;

        int count = 0;
        for (int index = 0; index < arrayLength; index++) {
            if (array1.length == array2.length && array1[index] == array2[index])
                count = count + 1;
        }
        if (count == arrayLength)
            equal();
        else
            notEqual();
    }

    public static void notEqual() {
        System.out.println("FALSE");
    }

    public static void equal() {
        System.out.println("TRUE");
    }
}
