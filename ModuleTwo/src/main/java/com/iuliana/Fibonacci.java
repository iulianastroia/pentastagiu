package com.iuliana;

/**
 * @author Iuliana
 */
public class Fibonacci {
    /*
        Write a program that will print the first x fibonacci numbers. Also calculate the average value. For example
        For an input of x = 20 the output should be:

        The first 20 Fibonacci numbers are:
                1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
        The average is 885.5*/
    public static void main(String args[]) {
        int x = 20;
        int t1 = 1, t2 = 1;
        int sum = 0;
        System.out.print("The first 20 Fibonacci numbers are:\n");
        for (int index = 1; index <= x; index++) {
            System.out.print(t1 + " ");

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;

        }
        float average = (float)sum / x;
        System.out.println("\nThe average is: " + average);

    }


}
