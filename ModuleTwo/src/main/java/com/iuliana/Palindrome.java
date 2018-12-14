package com.iuliana;

/**
 * @author Iuliana
 */

/*
Write a program to test whether a given string is a palindrome or not

For example
Given the following string “aaabccbaaa” should return TRUE
Given the following string “abccbb” should return FALSE
*/
public class Palindrome {
    public static void main(String args[]) {

        String string1 = "aaabccbaaa";
        String string2 = "abccbb";
        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        System.out.print("String aaabccbaaa->");
        palindromeTest(char1);
        System.out.print("String abccbb->");

        palindromeTest(char2);
    }

    public static void palindromeTest(char[] array) {
        int count = 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - i - 1]) {
                count = 0;
            } else {
                count = 1;
                notPal();
                break;
            }
        }
        if (count == 0)
            pal();

    }

    public static void pal() {
        System.out.println("String given is palindrome");
    }

    public static void notPal() {
        System.out.println("String given is not palindrome");
    }
}
