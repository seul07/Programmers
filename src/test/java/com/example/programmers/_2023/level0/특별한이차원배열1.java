package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 특별한이차원배열1 {
    int n = 3;
    @Test
    public void test() {
        int[][] answer = new int[n][n];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                if(i==j){
                    answer[i][j] = 1;
                }else{
                    answer[i][j]= 0;
                }
            }
        }
        assertThat(true);
    }
}
