package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _9로나눈나머지 {
    String number = "123";
    @Test
    public void test() {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(number.charAt(i)+"");
        }
        int answer = sum%9;
        assertThat(6).isEqualTo(answer);
    }
}
