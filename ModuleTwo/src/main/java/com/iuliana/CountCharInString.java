package com.iuliana;

/**
 * @author Iuliana
 */
/*
Write a program that will count how many times a character appears in a String

For example
Given the string “Hello java world” and the target character ‘a’ the output should be 2
(since ‘a’ appears twice in “Hello java world”)
*/
public class CountCharInString {
    public static void main(String args[]) {
        String stringVar = "Hello java world";
        int count = 0;
        char[] chars = stringVar.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a')
                count++;
        }

        System.out.println("Count for 'a' character: " + count);

    }
}
