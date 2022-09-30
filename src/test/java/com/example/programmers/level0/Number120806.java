package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Number120806 {
    int num1 = 3;
    int num2 = 2;
    @Test
    public void test() {
        int answer = (int)(((double)num1/num2)*1000);
        System.out.println(answer);
        assertThat(true);
    }
}
