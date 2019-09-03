package com.hacker.rank.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _10_PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int maxSizeOfSubArray = 0;
        int count = 0;
        int firstValue = 0;
        for(int i=0; i<a.size(); i++) {
            if(firstValue == 0) {
                firstValue = a.get(i);
                count++;
            } else if(firstValue == a.get(i) || (a.get(i) - firstValue) == 1){
                count++;
            } else {
                if(count > maxSizeOfSubArray){
                    maxSizeOfSubArray = count;
                }
                firstValue = a.get(i);
                count=0;
                count++;
            }
        }

        if(count > maxSizeOfSubArray){
            maxSizeOfSubArray = count;
        }
        return maxSizeOfSubArray;
    }

    public static void main(String[] args) {
        System.out.println(_10_PickingNumbers.pickingNumbers(Arrays.asList(4,6,5,3,3,1)));
    }
}
