package com.hacker.rank.arrays;

public class _2_LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        for(int i=0; i<(d % a.length); i++) {
            int index=0;
            int aux=a[0];
            while(index < a.length-1) {

                a[index] = a[index+1];
                index++;
            }
            a[a.length-1]=aux;
        }
        return a;
    }

    public static void main(String[] args) {
        //int[] result = _2_LeftRotation.rotLeft(new int[]{1,2,3,4,5}, 56);
        System.out.println(73642 % 60581);

    }
}
