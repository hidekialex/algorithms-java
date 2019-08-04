package com.hacker.rank.warmupchallenges;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _1_SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        Set<Integer> sockPairs = new HashSet<>();
        int quantity = 0;
        for(int i=0; i<n; i++) {
            if(sockPairs.contains(ar[i])) {
                sockPairs.remove(ar[i]);
                quantity++;
            } else {
                sockPairs.add(ar[i]);
            }

        }
        return quantity;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int value = _1_SockMerchant.sockMerchant(9 , new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20});
        System.out.println(value);
    }
}