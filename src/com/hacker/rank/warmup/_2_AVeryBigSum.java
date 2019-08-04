package com.hacker.rank.warmup;

public class _2_AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(int i=0; i<ar.length;i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long result = _2_AVeryBigSum.aVeryBigSum(new long[]{1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L});
        System.out.println(result);
    }
}
