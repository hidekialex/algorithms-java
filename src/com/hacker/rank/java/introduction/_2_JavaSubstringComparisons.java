package com.hacker.rank.java.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2_JavaSubstringComparisons {

    public static void main(String[] args) {

        String smallest = "";
        String largest = "";

        String value = "welcometojava";
        int substringValue = 3;

        List<String> chunkedValues = new ArrayList<>();
        for(int i=0; i<value.length()-(substringValue-1); i++) {
            String chunk = value.substring(i, substringValue+i);
            chunkedValues.add(chunk);
        }
        Collections.sort(chunkedValues);
        System.out.println(chunkedValues.get(0));
        System.out.println(chunkedValues.get(chunkedValues.size()-1));
    }
}
