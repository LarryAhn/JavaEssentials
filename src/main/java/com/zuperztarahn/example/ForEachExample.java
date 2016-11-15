package com.zuperztarahn.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahn on 2016. 11. 15..
 */
public class ForEachExample {

    public static void main(String[] args) {

        java8ForEachExample();

    }

    public static void java8ForEachExample() {
        List language = new ArrayList();
        language.add("Java");
        language.add("C++");
        language.add("Python");

        language.forEach(System.out::println);

        language.forEach(v->System.out.println(v));
    }

}
