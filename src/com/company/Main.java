package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String name = "asfadg";
        int age = 5;
        map.put("a", "fdag");
        map.put("f", "skdjafh");

        Map<String, String> map1;

        MyClass myClass1 = new MyClass(age, name, map);


        MyClass myClass2 = new MyClass(age, name, map);

        Set<MyClass> set = new HashSet<>();
        set.add(myClass1);
        set.add(myClass2);


        System.out.println(set);
    }
}
