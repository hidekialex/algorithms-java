package com.hacker.rank.warmup;

import javax.sound.midi.SysexMessage;

public class _5_Staircase {

    static void staircase(int n) {
        for(int i=1; i<=n; i++) {
            StringBuilder chunk = new StringBuilder();
            for(int j=n-i; j >= 1; j--) {
                chunk.append(" ");
            }
            for(int k=0; k<i;k++) {
                chunk.append("#");
            }
            System.out.println(chunk.toString());
        }
    }

    public static void main(String[] args) {
        _5_Staircase.staircase(4);
    }
}
