package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumAllNumbers {
    int n = 987;
    @Test
    public void test() {
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        assertThat(sum).isEqualTo(24);
    }
}
