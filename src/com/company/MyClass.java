package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class MyClass {
    private final int num;
    private final String name;
    private final Map<String, String> map;


    public MyClass(int num, String name, Map<String, String> map) {
        this.num = num;
        this.name = name;
        this.map = new HashMap<>(map);
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getMap() {
        return new HashMap<>(map);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return num == myClass.num && Objects.equals(name, myClass.name) && Objects.equals(map, myClass.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, map);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", map=" + map +
                '}';
    }
}
