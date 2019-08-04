package com.hacker.rank.warmupchallenges;

public class _2_CountingValleys {

    static int countingValleys(int n, String s) {

        char[] path = s.toCharArray();
        int nivel = 0;
        int countValleys =0;
        for(int i=0; i<n; i++) {
            if ('U' == path[i]) {
                if(nivel == -1){
                    countValleys++;
                    nivel=0;
                    continue;
                }
                nivel++;
            } else if ('D' == path[i]) {
                nivel--;
            }
        }
        return countValleys;
    }

    public static void main(String[] args) {
        int value = _2_CountingValleys.countingValleys(8, "UDDDUDUU");
        System.out.print(value);
    }
}
