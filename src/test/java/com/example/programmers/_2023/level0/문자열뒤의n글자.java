package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열뒤의n글자 {
    String my_string = "ProgrammerS123";
    int n = 11;
    @Test
    public void test() {
        String answer = my_string.substring(my_string.length()-n);
        assertThat("grammerS123").isEqualTo(answer);
    }
}
