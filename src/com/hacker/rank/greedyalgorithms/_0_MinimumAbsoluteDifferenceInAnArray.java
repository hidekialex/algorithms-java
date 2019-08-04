package com.hacker.rank.greedyalgorithms;

import java.util.Arrays;

public class _0_MinimumAbsoluteDifferenceInAnArray {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);
        int absoluteValue=0;
        for(int i=arr.length-1; i>0; i--) {
            if(i==arr.length-1) {
                absoluteValue = (arr[i]-arr[i-1]) < 0 ? -1*(arr[i]-arr[i-1]) : (arr[i]-arr[i-1]);
            }
            int valueToCompare = (arr[i]-arr[i-1]) < 0 ? -1*(arr[i]-arr[i-1]) : (arr[i]-arr[i-1]);
            if(valueToCompare < absoluteValue) {
                absoluteValue = valueToCompare;
            }
        }
        return absoluteValue;
    }

    public static void main(String[] args) {
        int result = _0_MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75});
        System.out.println(result);
    }
}
