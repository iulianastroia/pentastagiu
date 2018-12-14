package com.iuliana;

/**
 * @author Iuliana
 */

/*
Write a program that will return a different string representing the alphabet index of each letter.
Assuming we have the following alphabet encoding
a = 0
b = 1
c = 2
d = 3
…
For the given string “abcd” the output should be “0123”
*/
public class AlphabetIndex {
    public static void main(String args[]) {
        String stringVar = "abcd";

        char letter;
        for (int i = 0; i < stringVar.length(); i++) {
            letter = stringVar.charAt(i);
            if (letter >= 'A' && letter <= 'Z')
                System.out.print((int) letter - 'A');
            if (letter >= 'a' && letter <= 'z')
                System.out.print((int) letter - 'a');
        }

    }
}
