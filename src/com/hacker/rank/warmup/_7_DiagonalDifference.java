package com.hacker.rank.warmup;

import java.util.Arrays;
import java.util.List;

public class _7_DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for(int i=0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i);
            primaryDiagonal += row.get(i);
            secondaryDiagonal += row.get(arr.size()-(i+1));
        }
        return Math.abs(primaryDiagonal-secondaryDiagonal);
    }

    public static void main(String[] args) {
        List<Integer> row1 = Arrays.asList(11, 2, 4);
        List<Integer> row2 = Arrays.asList(4, 5, 6);
        List<Integer> row3 = Arrays.asList(10, 8, -12);

        List<List<Integer>> matriz = Arrays.asList(row1, row2, row3);

        int i = _7_DiagonalDifference.diagonalDifference(matriz);
        System.out.println(i);
    }
}
