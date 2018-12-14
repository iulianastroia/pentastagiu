package com.iuliana;


import java.util.Arrays;

/**
 * @author Iuliana
 */


/*
Write a java program that will concatenate 2 arrays.
For example
Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing [1,2,3,4,5,6,7,8]
*/
public class Concatenate {
    public static void main(String args[]) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int a1Len = array1.length;
        int a2Len = array2.length;
        int[] result = new int[a1Len + a2Len];

        System.arraycopy(array1, 0, result, 0, a1Len);
        System.arraycopy(array2, 0, result, a1Len, a2Len);

        System.out.println(Arrays.toString(result));
    }
}
