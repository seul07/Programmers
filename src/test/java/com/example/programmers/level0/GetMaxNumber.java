package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetMaxNumber {
    int[] numbers = new int[]{1,2,3,4,5};
    @Test
    public void test() {
        int mul = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                mul = Math.max(mul,numbers[i]*numbers[j] );
            }
        }
        assertThat(mul).isEqualTo(20);
    }
}
