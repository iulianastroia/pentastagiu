package com.iuliana;

/**
 * @author Iuliana
 */
/*
Write a program that will insert a # between any duplicate letters that are placed right next to each.
For example

Given the following string “Hello world” the output should be “Hel#lo world”
*/
public class DuplicateLetters {
    public static void main(String args[]) {
        String string = "Hello World";
//TODO don't delete duplicated letter
        char[] chars = string.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                chars[i + 1] = '#';
                count++;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
//        String duplicated = chars.toString();
        String b = new String(chars);
        System.out.println("\n" + b);
    }
}
