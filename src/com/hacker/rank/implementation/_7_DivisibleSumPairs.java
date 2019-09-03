package com.hacker.rank.implementation;

public class _7_DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int result = 0;
        for(int i=0; i<n; i++) {
            if(i == n-1) {
                break;
            }
            for(int j=i+1; j<n; j++) {
                int sum = ar[i] + ar[j];
                if((sum % k) == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(_7_DivisibleSumPairs.divisibleSumPairs(6, 3, new int[]{1,3,2,6,1,2}));
    }
}
