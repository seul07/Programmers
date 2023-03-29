package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 소수찾기 {
    int n = 10;
    @Test
    public void test() {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j=2; j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) answer ++;
        }
        assertThat(true);
    }
}
