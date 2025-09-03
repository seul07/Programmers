package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 숫자문자열과영단어 {
    String s = "1zerotwozero3";
    @Test
    public void test() {
        String[] alpa = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < alpa.length; i++) {
            if(s.contains(alpa[i])){
                s = s.replaceAll(alpa[i],i+"");
            }
        }
        assertThat(true);
    }
}
