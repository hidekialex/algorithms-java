package com.hacker.rank.warmup;

import java.util.Arrays;

public class _6_BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        int max=0;
        Arrays.sort(ar);
        int[] candles = new int[ar[ar.length-1]];
        for(int i=0; i<ar.length; i++) {
            if(i==0) {
                max=ar[i];
                candles[ar[i]-1]++;
                continue;
            }
            if(ar[i] >= max) {
                max = ar[i];
                candles[ar[i]-1]++;
                continue;
            }
        }
        return candles[max-1];
    }

    public static void main(String[] args) {
        int i = _6_BirthdayCakeCandles.birthdayCakeCandles(new int[]{18, 90, 90, 13, 90, 75, 90, 8, 90, 43});
        System.out.println(i);
    }
}
