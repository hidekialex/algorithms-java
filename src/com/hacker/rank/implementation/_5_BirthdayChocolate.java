package com.hacker.rank.implementation;

import java.util.Arrays;
import java.util.List;

public class _5_BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {

        int equalling = 0;
        for(int i=0; i <= s.size()-m; i++) {
            int sum = 0;
            for(int j=i; j < m+i; j++) {
                sum += s.get(j);
            }
            if(d == sum) {
                equalling++;
            }
        }
        return equalling;
    }

    public static void main(String[] args) {
        int birthday = _5_BirthdayChocolate.birthday(Arrays.asList(4), 4, 1);
        System.out.println(birthday);
    }
}
