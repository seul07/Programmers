package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열정수의합 {
    String num_str = "123456789";
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        System.out.println(answer);
        assertThat(true);
    }
}
