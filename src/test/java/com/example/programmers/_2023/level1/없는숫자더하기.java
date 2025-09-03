package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 없는숫자더하기 {
    int[] numbers = {1,2,3,4,6,7,8,0};
    @Test
    public void test() {
        int answer = 0;

        int total=0;
        for (int i = 0; i < 10; i++) {
            total +=i;
        }
        int sum = Arrays.stream(numbers).sum();
        answer = total-sum;

        assertThat(answer).isEqualTo(14);
    }
}
