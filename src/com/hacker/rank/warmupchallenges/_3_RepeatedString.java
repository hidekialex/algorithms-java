package com.hacker.rank.warmupchallenges;

public class _3_RepeatedString {

    static long repeatedString(String s, long n) {

        char[] letterArray = s.toCharArray();
        int[] positions = new int[letterArray.length];

        int countPosition = 0;
        int quantityLetterA = 0;
        for(int i =0; i<letterArray.length; i++) {
            if('a' == letterArray[i]) {
                positions[countPosition++]=i;
                quantityLetterA++;
            }
        }
        long timesToMultiply = n / letterArray.length;
        long restToVerify = n % letterArray.length;

        long notAboluteLetterA = quantityLetterA * timesToMultiply;

        int restToSum = 0;
        for(int j =0; j< positions.length; j++) {
            if(positions[j] < restToVerify) {
                restToSum++;
                continue;
            }
            break;
        }

        return notAboluteLetterA + restToSum;
    }

    public static void main(String[] args) {
        _3_RepeatedString.repeatedString("a", 1000000000000L);
    }
}
