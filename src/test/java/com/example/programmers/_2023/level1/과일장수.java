package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class 과일장수 {
    int k = 4;
    int m = 3;
    int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
    @Test
    public void test() {
        Integer score2[] = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(score2, Collections.reverseOrder());
        int result = 0;
        int cnt = 1;
        for (int i = 0; i < score2.length; i++) {
            if(cnt==m){
                cnt=0;
                result += score2[i]*m;
            }
            cnt++;
        }
        System.out.println(result);
    }
}
