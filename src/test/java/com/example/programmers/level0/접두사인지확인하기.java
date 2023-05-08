package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 접두사인지확인하기 {
    String my_string = "banana";
    String is_prefix = "nan";
    @Test
    public void test() {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }
        assertThat(0).isEqualTo(answer);
    }
}
