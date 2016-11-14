package com.zuperztarahn.example;


import java.util.StringTokenizer;

/**
 * Created by Ahn on 2016. 11. 14..
 */
public class StringTokenizerExample {

    public static void main(String[] args) {
        stringTokenizerExample();
    }

    public static void stringTokenizerExample() {

        String packageName = "com.zuperztarahn.example";
        StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }


}
