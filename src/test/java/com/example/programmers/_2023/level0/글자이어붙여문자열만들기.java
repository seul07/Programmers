package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 글자이어붙여문자열만들기 {
    String my_string = "cvsgiorszzzmrpaqpe";
    int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
    @Test
    public void test() {
        String answer = "";
        for (int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        assertThat("programmers").isEqualTo(answer);
    }
}
