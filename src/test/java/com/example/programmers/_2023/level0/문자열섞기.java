package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열섞기 {
    String str1 = "aaaaa";
    String str2 = "bbbbb";
    @Test
    public void test() {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        assertThat(true);
    }
}
