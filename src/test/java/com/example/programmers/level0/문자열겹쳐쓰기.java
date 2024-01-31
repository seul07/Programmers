package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열겹쳐쓰기 {
    String my_string = "hahahahahahahahha";
    String overwrite_string = "youretoslow";
    int s = 4;
    String result = "hahayouretoslowha";
    @Test
    public void test() {
        String answer = my_string.substring(0,s)+ overwrite_string + my_string.substring(s+overwrite_string.length(),my_string.length());

        System.out.println(answer);
    }
}
