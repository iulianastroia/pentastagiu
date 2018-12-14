package com.iuliana;

/**
 * @author Iuliana
 */

/*
Write a program that will test whether a string ends with another string

For example
Given the following strings “Hello java world” and “orld” the output should be TRUE
*/
public class CheckEndOfString {
    public static void main(String args[]) {
        String stringVar="Hello java world";
        String stringVar2="orld";
        if(stringVar.endsWith(stringVar2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }
}
