package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SharePizza {
    int n = 15;
    @Test
    public void test() {
        int answer = n/7;
        if(n%7>0) answer +=1;
        assertThat(answer).isEqualTo(3);
    }
}
