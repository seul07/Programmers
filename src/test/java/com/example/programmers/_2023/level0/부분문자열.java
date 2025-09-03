package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.linesOf;

public class 부분문자열 {
    String str1 = "abc";
    String str2 = "aabcc";
    @Test
    public void test() {
        int answer = 0;
        if(str2.contains(str1)) answer = 1;
        assertThat(answer).isEqualTo(1);
    }
}
