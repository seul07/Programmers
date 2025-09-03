package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 카운트다운 {
    int start = 10;
    int end = 3;
    @Test
    public void test() {
        int[] answer = new int[start-end+1];
        int cnt = 0;
        for (int i = start; i >= end; i--) {
            answer[cnt] = i;
            cnt++;
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
