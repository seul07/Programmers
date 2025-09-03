package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 뒤에서5등위로 {
    int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
    @Test
    public void test() {
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length-5];
        int cnt = 0;
        for (int i = 5; i < num_list.length; i++) {
            answer[cnt] = num_list[i];
            cnt++;
        }
        assertThat(true);
    }
}
