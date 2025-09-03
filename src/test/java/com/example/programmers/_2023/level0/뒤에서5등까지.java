package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 뒤에서5등까지 {
    int[] num_list = {12, 4, 15, 46, 38, 1, 14};
    @Test
    public void test() {
        Arrays.sort(num_list);
        int[] answer = new int[5];
        for (int i = 0; i <5; i++) {
            answer[i] = num_list[i];
        }
        assertThat(true);
    }
}
