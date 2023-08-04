package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class rny_string {
    String rny_string = "masterpiece";
    @Test
    public void test() {
        String answer = rny_string.replaceAll("m","rn");
        assertThat(true);
    }
}
