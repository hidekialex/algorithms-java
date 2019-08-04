package com.hacker.rank.java.advanced;

import sun.security.provider.MD5;

import java.math.BigInteger;

public class _3_JavaLambdaExpressions {
}

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation idOdd() {
        return (value) -> {
            if((value % 2) != 0) {
                return true;
            }
            return false;
        };
    }

    public static PerformOperation isPrime(){
        return (value) -> {
            BigInteger valueToVerify = new BigInteger(String.valueOf(value));
            if(valueToVerify.isProbablePrime(1)) {
                return true;
            }
            return false;
        };
    }

    public static PerformOperation isPalindrome() {
        return (value) -> {

            String valueToVerify = String.valueOf(value);
            char[] eachNumberArray = valueToVerify.toCharArray();

            for(int i=0; i<eachNumberArray.length; i++) {
                if(eachNumberArray[i] == eachNumberArray[(eachNumberArray.length-1)-i]) {
                    continue;
                }
                return false;
            }
            return true;
        };
    }
}