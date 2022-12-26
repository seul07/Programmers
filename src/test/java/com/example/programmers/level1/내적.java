package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 내적 {
    int[] a = {1,2,3,4};
    int[] b = {-3,-1,0,2};
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        assertThat(answer).isEqualTo(3);
    }
}
