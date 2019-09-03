package com.hacker.rank.implementation;

import java.util.Arrays;
import java.util.List;

public class _8_BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalBill = 0;
        for(int i=0; i<bill.size(); i++) {
            if(i == k) {
                continue;
            }
            totalBill += bill.get(i);
        }
        int division = totalBill / 2;
        if(division == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-division);
        }
    }

    public static void main(String[] args) {
        _8_BonAppetit.bonAppetit(Arrays.asList(3,10,2,9), 1, 7);
    }
}
