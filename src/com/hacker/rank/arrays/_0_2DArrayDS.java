package com.hacker.rank.arrays;

public class _0_2DArrayDS {

    static int hourglassSum(int[][] arr) {

        /*
            1 1 1 0 0 0
            0 1 0 0 0 0
            1 1 1 0 0 0
            0 0 2 4 4 0
            0 0 0 2 0 0
            0 0 1 2 4 0
        */
        int cols = arr[0].length - 2;
        int rows = arr.length - 2;
        int maxSum = -100;
        for(int i=0 ; i < cols; i++) {
            for(int j=0; j < rows; j++) {
                int acumulatedValue = 0;
                acumulatedValue = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                acumulatedValue += arr[i+1][j+1];
                acumulatedValue += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(maxSum < acumulatedValue){
                    maxSum = acumulatedValue;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] values = {
                {-9,-9,-9, -1, -1, -1},
                { 0,-9, 0, -4, -3, -2},
                {-9,-9,-9, -1, -2, -3},
                { 0, 0, -8, -6, -6, -0},
                { 0, 0, 0,-2, 0, 0},
                { 0, 0, -1, -2, -4, 0}
        };
        int result = _0_2DArrayDS.hourglassSum(values);
        System.out.println(result);
    }
}
