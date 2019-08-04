package com.hacker.rank.warmup;

import java.util.Arrays;

public class _3_MiniMaxSum {

    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for(int i=0; i<2; i++) {
            for(int j=0; j<4; j++) {
                if(i==0) {
                    min += arr[j];
                } else {
                    max += arr[j+1];
                }
            }
        }
        System.out.println(min + " " + max);

    }

    public static void main(String[] args) {
        _3_MiniMaxSum.miniMaxSum(new int[]{769082435, 210437958, 673982045, 375809214, 380564127});
    }
}
