package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfEvenNumber {
    int n = 10;
    @Test
    public void test() {
        int sum = 0;
        int s = 2;
        while(s<=10){
            sum += s;
            s=s+2;
        }
        assertThat(30).isEqualTo(sum);
    }
}
