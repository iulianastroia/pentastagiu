package com.iuliana;

/**
 * @author Iuliana
 */

/*Write a java program to return the index of a target element.

For example:
Given  the following array [13,20,14,5,2,8]
 and a target element 5 the output should be : 3 (because 5 is located at index 3 in the array)*/
public class ReturnIndex {
    public static void main(String args[]) {
        int[] array = {13, 20, 14, 5, 2, 8};
        System.out.println(index(array, 5));
    }

    public static int index(int[] array, int target) {
        int resultFound = 0;
        for (int i = 0; i < array.length; i++) {
            if (target == array[i])
                resultFound = i;
        }
        return resultFound;
    }
}
