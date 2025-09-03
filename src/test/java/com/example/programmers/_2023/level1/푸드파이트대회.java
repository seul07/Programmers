package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 푸드파이트대회 {
    int[] food = {1,3,4,6};
    // 0 = 1 개
    // 1 = 3 개
    // 2 = 4 개
    // 3 = 6 개
    // 1223330333221
    @Test
    public void test() {
        String answer = "0";
        for (int i = food.length-1; i > 0; i--) {
            int tmp = food[i]/2;
            for (int j = 0; j < tmp; j++) {
                answer = i+answer+i;
            }
        }
        assertThat(answer).isEqualTo("1223330333221");
    }
}
