package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 공던지기 {
    int[] numbers = {1,2,3,4};
    int k = 2;
    @Test
    public void test() {
        int answer = numbers[(k-1)*2%numbers.length];
        System.out.println(answer);
        assertThat(true);
    }
}
