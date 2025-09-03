package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfDivisor {
    int n = 12;
    @Test
    public void test() {
        int sum = 0;
        if(n!=0){
            sum = 1;
            for (int i = 2; i <= n; i++) {
                if(n%i==0){
                    sum += i;
                }
            }
        }

        assertThat(sum).isEqualTo(28);
    }
}
