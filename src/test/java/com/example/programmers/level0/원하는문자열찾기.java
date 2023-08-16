package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 원하는문자열찾기 {
    String myString = "AbCdEfG";
    String pat = "aBc";
    @Test
    public void test() {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        if(myString.contains(pat)) answer = 1;
        assertThat(answer).isEqualTo(1);
    }
}
