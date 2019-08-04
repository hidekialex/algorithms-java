package com.hacker.rank.warmupchallenges;

public class _0_JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        int totalJumps = 0;
        for(int i=0; i < c.length-1;) {
            if(i+1 == c.length-1) {
                i++;
            }else if(c[i+2] == 0 || c[i+1] == 1 ) {
                i +=2;
            } else {
                i++;
            }
            totalJumps++;
        }
        return totalJumps;
    }

    public static void main(String[] args) {
        int value = _0_JumpingOnTheClouds.jumpingOnClouds(new int[]{0,0,0,1,0, 0});
        System.out.println(value);
    }
}
