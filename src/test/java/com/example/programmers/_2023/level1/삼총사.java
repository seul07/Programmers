package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 삼총사 {
    int[] number = {-1, 1, -1, 1};
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if(number[i]+number[j]+number[k]==0){
                       answer++;
                    }
                }
            }
        }
        assertThat(answer).isEqualTo(0);
    }
}
