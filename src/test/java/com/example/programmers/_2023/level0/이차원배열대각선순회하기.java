package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 이차원배열대각선순회하기 {
    int[][] board = {{0,1,2},{1,2,3},{2,3,4},{3,4,5}};
    int k = 2;
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i+j<=k){
                    answer += board[i][j];
                }
            }
        }
        assertThat(true);
    }
}
