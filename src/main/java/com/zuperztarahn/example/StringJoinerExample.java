package com.zuperztarahn.example;

import java.util.StringJoiner;

/**
 * Created by Ahn on 2016. 11. 11..
 */
public class StringJoinerExample {

    public static void main(String[] args) {

        stringJoinerExampleOne();
        stringJoinerExampleTwo();

    }


    /**
     * StringJoiner example by a delimiter.
     *
     */
    public static void stringJoinerExampleOne() {
        StringJoiner stringJoiner = new StringJoiner(".");
        stringJoiner.add("com");
        stringJoiner.add("zuperztarahn");
        stringJoiner.add("example");
        System.out.println(stringJoiner.toString());
    }


    /**
     * StringJoiner example by delimiter and starting with a supplied prefix and ending with a supplied suffix.
     *
     */
    public static void stringJoinerExampleTwo() {
        StringJoiner stringJoiner = new StringJoiner(".", "https://", "/LawrenceAhn");
        stringJoiner.add("www");
        stringJoiner.add("github");
        stringJoiner.add("com");
        System.out.println(stringJoiner.toString());
    }

}
