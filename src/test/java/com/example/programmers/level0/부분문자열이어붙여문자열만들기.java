package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 부분문자열이어붙여문자열만들기 {
    String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
    int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
    @Test
    public void test() {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }
        assertThat(true);
    }
}
