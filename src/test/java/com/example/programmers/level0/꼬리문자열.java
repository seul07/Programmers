package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 꼬리문자열 {
    String[] str_list = {"abc", "def", "ghi"};
    String ex = "ef";
    @Test
    public void test() {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) {
            if(!str_list[i].contains(ex)){
                answer += str_list[i];
            }
        }
        assertThat(answer).isEqualTo("abcghi");
    }
}
