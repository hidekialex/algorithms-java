package com.hacker.rank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _1_CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int ALICE=0;
        int BOB=1;
        List<Integer> scoreBoard = new ArrayList<>();
        scoreBoard.add(ALICE,0);
        scoreBoard.add(BOB,0);
        IntStream
                .range(0, b.size())
                .mapToObj(new IntFunction<Object>() {
                    @Override
                    public Object apply(int value) {
                        if(a.get(value) > b.get(value)){
                            scoreBoard.set(ALICE, scoreBoard.get(ALICE)+1);
                        } else if(a.get(value) < b.get(value)){
                            scoreBoard.set(BOB, scoreBoard.get(BOB)+1);
                        }
                        return null;
                    }
                }).collect(Collectors.toList());
        return scoreBoard;
    }

    public static void main(String[] args) {
        List<Integer> result = _1_CompareTheTriplets.compareTriplets(Arrays.asList(17, 28, 30), Arrays.asList(99, 16, 8));
        System.out.println(result);
    }
}
