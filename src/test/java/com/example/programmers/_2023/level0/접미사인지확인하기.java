package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 접미사인지확인하기 {
    String my_string = "banana";
    String is_suffix = "ana";
    @Test
    public void test() {
        int answer = 0;
        if(is_suffix.length()<=my_string.length()){
            String tmp = my_string.substring(my_string.length()-is_suffix.length(),my_string.length());
            if(is_suffix.equals(tmp)){
                answer = 1;
            }
        }
        assertThat(true);
    }
}
