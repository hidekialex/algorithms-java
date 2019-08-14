package com.hacker.rank.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _4_AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        List<Integer> calculatedApples = Arrays.stream(apples)
                .boxed().map(apple -> a+apple).collect(Collectors.toList());
        List<Integer> calculatedOranges = Arrays.stream(oranges)
                .boxed().map(orange -> b+orange).collect(Collectors.toList());

        int totalApplesFalled = calculatedApples.stream()
                .filter(ca -> ca >= s && ca <= t)
                .collect(Collectors.toList()).size();

        int totalOrangesFalled = calculatedOranges.stream()
                .filter(co -> co >= s && co <= t)
                .collect(Collectors.toList()).size();

        System.out.println(totalApplesFalled);
        System.out.println(totalOrangesFalled);
    }

    public static void main(String[] args) {
        _4_AppleAndOrange.countApplesAndOranges(7, 10, 4, 12, new int[]{2,3,-4}, new int[]{3,-2,-4});
    }
}
