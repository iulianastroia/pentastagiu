package com.iuliana;

/**
 * @author Iuliana
 */
/*
Write a program that test if a given String contains another String.

For example
Given the following base String “Hello java world” and the target test String “java”
 the output should be TRUE
*/
public class ContainsString {
    public static void main(String args[]){
        String stringVar1="Hello java world";
        String stringVar2="java";
        if(stringVar1.contains(stringVar2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }
}
