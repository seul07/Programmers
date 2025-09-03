package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 숨어있는숫자의덧셈 {
    String my_string = "1a2b3c4d123Z";
    @Test
    public void test() {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }
        System.out.println(answer);
        assertThat(true);
    }
}
