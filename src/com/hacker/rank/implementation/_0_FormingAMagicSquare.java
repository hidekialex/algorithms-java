package com.hacker.rank.implementation;

public class _0_FormingAMagicSquare {

    static int formingMagicSquare(int[][] s) {

        int[] usedNumbers = new int[9];
        int row = s.length;
        int col = s[0].length;

        int sumRow=0;
        int sumCol=0;
        for(int i=0; i<row; i++){
            if ((i % 2 != 0)) continue;
            for(int j=0;j<col; j++){
                int rowNumber = s[i][j];
                sumRow += rowNumber;

                int colNumber = s[j][i];
                sumCol += colNumber;
            }
            sumRow=0;
            sumCol=0;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] values = {
                {4,9,2},
                {3,5,7},
                {8,1,5}
        };
        _0_FormingAMagicSquare.formingMagicSquare(values);
    }
}
