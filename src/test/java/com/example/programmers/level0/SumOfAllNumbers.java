package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfAllNumbers {
    int n = 1234;
    @Test
    public void test() {
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        assertThat(sum).isEqualTo(10);
    }
}
