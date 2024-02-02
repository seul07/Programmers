package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 전국대회선발고사 {
    int[] rank = {3, 7, 2, 5, 4, 6, 1};
    boolean[] attendance = {false, true, true, true, true, false, false};
    @Test
    public void test() {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < attendance.length; i++) {
            if(attendance[i]){
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        int answer = 0;
        int gob = 10000;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < rank.length; i++) {
                if(list.get(j)==rank[i]){
                    answer += i*gob;
                    gob = gob/100;
                }
            }
        }
    }
}
