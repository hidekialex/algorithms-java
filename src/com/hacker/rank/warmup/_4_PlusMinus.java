package com.hacker.rank.warmup;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;

public class _4_PlusMinus {

    static void plusMinus(int[] arr) {

        Arrays.sort(arr);

        int positive =0;
        int negative =0;
        int zero = 0;
        for(int i=0; i<arr.length;i++) {
            if(arr[i] > 0) {
                positive++;
            } else if(arr[i] < 0) {
                negative++;
            } else if(arr[i] ==0) {
                zero++;
            }
        }
        System.out.println(new BigDecimal((double)positive).divide(new BigDecimal(arr.length), MathContext.DECIMAL128).setScale(6, BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal((double)negative).divide(new BigDecimal(arr.length), MathContext.DECIMAL128).setScale(6, BigDecimal.ROUND_HALF_UP));
        System.out.println(new BigDecimal((double)zero).divide(new BigDecimal(arr.length), MathContext.DECIMAL128).setScale(6, BigDecimal.ROUND_HALF_UP));
    }

    public static void main(String[] args) {
        _4_PlusMinus.plusMinus(new int[] {-4, 3, -9, 0, 4, 1});
    }
}
