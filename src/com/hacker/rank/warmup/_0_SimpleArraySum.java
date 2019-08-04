package com.hacker.rank.warmup;

public class _0_SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int i=0; i<ar.length;i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        _0_SimpleArraySum.simpleArraySum(new int[] {});
    }
}
