package com.zuperztarahn.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ahn on 2016. 11. 15..
 */
public class ForEachExample {

    public static void main(String[] args) {
        java8ForEachExample();
        classStyleForEachAndMap();
        java8ForEachAndMapLambdaExpression();
    }

    public static void java8ForEachExample() {
        List language = new ArrayList();
        language.add("Java");
        language.add("C++");
        language.add("Python");

        language.forEach(System.out::println);

        language.forEach(v->System.out.println(v));
        System.out.println();
    }

    public static void classStyleForEachAndMap() {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        System.out.println();
    }

    public static void java8ForEachAndMapLambdaExpression() {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Value E");
            }
        });

        System.out.println();
    }

}
