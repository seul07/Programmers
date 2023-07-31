package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 공백으로구분하기1 {
    String my_string = "i love you";
    @Test
    public void test() {
        String[] answer = my_string.split(" ");
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
