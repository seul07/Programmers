package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 특정문자열로끝나는가장긴부분문자열찾기 {
    String myString = "AbCdEFG";
    String pat = "dE";
    @Test
    public void test() {
        int last = myString.lastIndexOf(pat);
        String answer = myString.substring(0,last+pat.length());
        assertThat(true);
    }
}
