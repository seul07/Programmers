package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class x만큼간격이있는n개의숫자 {
    int x = -4;
    int n = 2;
    @Test
    public void test() {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = x*(i+1);
        }
        assertThat(true);
    }
}
