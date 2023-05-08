package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열만들기1 {
    int n = 10;
    int k = 3;
    @Test
    public void test() {
        int[] answer = new int[n/k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = k*(i+1);
        }
        assertThat(true);
    }
}
