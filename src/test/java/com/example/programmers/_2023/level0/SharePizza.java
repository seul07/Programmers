package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SharePizza {
    int n = 10;
    @Test
    public void test() {
        int cnt = 1;
        while((cnt*6)%n!=0){
            cnt++;
        }
        assertThat(cnt).isEqualTo(5);
    }
}
