package com.hacker.rank.sorting;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class _0_FraudulentActivityNotifications {

    static int activityNotifications(int[] expenditure, int d) {
        int[] clientSpend = Arrays.copyOfRange(expenditure, d, expenditure.length);
        AtomicInteger notifications = new AtomicInteger(0);
        int[] chunk = process(expenditure, 0, d, clientSpend, clientSpend.length - 1, notifications);
        processing(chunk, clientSpend[0], notifications);
        return notifications.get();
    }

    public static int[] process(int[] expenditure, int init, int end, int[] clientSpend, int spendCount, AtomicInteger notifications) {
        int[] auxChunk = Arrays.copyOfRange(expenditure, init, end);
        if(spendCount == 0) {
            return auxChunk;
        }
        int[] processedChunk = process(expenditure, init + 1, end + 1, clientSpend,spendCount-1, notifications);
        processing(processedChunk, clientSpend[init+1], notifications);
        return auxChunk;
    }

    public static void processing(int[] processedChunk, int spendValue, AtomicInteger notifications) {
        double mediam =0;
        Arrays.parallelSort(processedChunk);
        int division = processedChunk.length / 2;
        if((processedChunk.length % 2) == 0) {
            mediam = (double)(processedChunk[division-1] + processedChunk[division])/2;
        } else {
            mediam = (double)processedChunk[division];
        }
        if(spendValue >= (2*mediam)) {
            notifications.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        int result = _0_FraudulentActivityNotifications.activityNotifications(new int[]{2,3,4,2,3,6,8,4,5}, 5);
        System.out.println(result);
    }
}
