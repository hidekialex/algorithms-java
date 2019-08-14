package com.hacker.rank.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class _1_ExtraLongFactorials {

    static BigInteger calc(BigInteger value) {
        if(value.equals(BigInteger.ONE)) {
            return value;
        }
        BigInteger result = calc(value.subtract(BigInteger.ONE));
        return value.multiply(result);
    }

    static void extraLongFactorials(int n) {
        System.out.println(calc(BigInteger.valueOf(n)));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
