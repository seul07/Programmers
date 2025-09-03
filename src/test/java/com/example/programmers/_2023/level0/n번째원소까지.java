package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class n번째원소까지 {
    int[] num_list = {2,1,6};
    int n = 1;
    @Test
    public void test() {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
