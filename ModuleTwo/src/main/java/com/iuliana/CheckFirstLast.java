package com.iuliana;

/**
 * @author Iuliana
 */
public class CheckFirstLast {
    /*
Write a java program that will test whether the
first and the last element of an int array
are the same. We can assume the array has 2 or more elements.
For example:
For the following input [13,6,2,8,2,3] the output should be : FALSE
For the following input [13,6,2,8,2,13] the output should be : TRUE
*/
    public static void main(String args[]) {
        int[] array1 = {13, 6, 2, 8, 2, 3};
        int[] array2 = {13, 6, 2, 8, 2, 13};
        System.out.println("Checking first and last element for array1:");
        checkFirstLast(array1);
        System.out.println("Checking first and last element for array2:");

        checkFirstLast(array2);

    }

    public static void checkFirstLast(int[] array) {
        if (array[0] == array[array.length - 1]) {
            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");

        }
    }

}
