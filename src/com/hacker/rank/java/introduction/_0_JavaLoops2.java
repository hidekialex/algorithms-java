package com.hacker.rank.java.introduction;

public class _0_JavaLoops2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int n = 10;

        int result =0;
        for(int j=0; j<n; j++) {
            int potencia = (int)Math.pow(2,j);
            result += potencia*b;
            int resultFinal = a + result;
            System.out.print(resultFinal+" ");
        }
    }
}
