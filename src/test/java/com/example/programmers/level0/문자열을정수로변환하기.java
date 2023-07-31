package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열을정수로변환하기 {
    String n_str = "10";
    @Test
    public void test() {
        int answer = Integer.parseInt(n_str);
        assertThat(true);
    }
}
