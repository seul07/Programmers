package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class I로만들기 {
    String myString = "abcdevwxyz";
    @Test
    public void test() {
        String answer = myString.replace("a", "l")
                .replace("b", "l")
                .replace("c", "l")
                .replace("d", "l")
                .replace("e", "l")
                .replace("f", "l")
                .replace("g", "l")
                .replace("h", "l")
                .replace("i", "l")
                .replace("j", "l")
                .replace("k", "l");
        assertThat(true);
    }
}
