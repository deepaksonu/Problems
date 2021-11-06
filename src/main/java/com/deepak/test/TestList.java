package com.deepak.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestList {
    static boolean  useStr;
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("test");
        Map<Integer,List<String>> listMap = new HashMap<>();
        listMap.put(1, stringList);
        listMap.get(1).forEach(s -> System.out.println(s));

        String str = new String("Y");
        if(str != "N") useStr = true;
        System.out.println("useStr = " + useStr);
    }
}
