package com.hacker.rank.implementation;

public class _9_ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxValue = 0;
        for(int i=0; i < keyboards.length; i++) {
            for(int j=0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if(b >= sum && sum > maxValue){
                    maxValue = sum;
                }
            }
        }
        return maxValue == 0 ? -1 : maxValue;
    }

    public static void main(String[] args) {
        System.out.println(_9_ElectronicsShop.getMoneySpent(new int[]{4}, new int[]{5}, 5));
    }
}
