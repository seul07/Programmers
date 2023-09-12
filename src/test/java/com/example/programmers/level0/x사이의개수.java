package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class x사이의개수 {
    String myString = "oxooxoxxox";
    @Test
    public void test() {
        String[] arr = myString.split("x",-1);
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        assertThat(true);
    }

}
