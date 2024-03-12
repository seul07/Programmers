package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의전당_1 {
    int k = 10;
    int[] score = {1, 10, 2, 5, 6, 7, 8};
    @Test
    public void test() {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        if(k>score.length) k = score.length;
        for (int i = 0; i < k; i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        for (int i = k; i < score.length; i++) {
            for (int j = 0; j < k; j++) {
                if(score[i]>list.get(j)){
                    list.remove(j);
                    list.add(score[i]);
                    break;
                }
            }
            Collections.sort(list);
            answer[i]=list.get(0);
        }
        System.out.println(Arrays.toString(answer));
    }
}
