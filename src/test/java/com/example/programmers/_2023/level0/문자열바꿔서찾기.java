package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열바꿔서찾기 {
    String myString = "ABBAA";
    String pat = "AABB";
    @Test
    public void test() {
        String tmp = myString;
        tmp = tmp.replaceAll("B","C");
        tmp = tmp.replaceAll("A","B");
        tmp = tmp.replaceAll("C","A");
        int answer = 0;
        if(tmp.contains(pat)) answer = 1;
        assertThat(true);
    }
}
