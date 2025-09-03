package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 행렬의덧셈 {
    int[][] arr1 = {{1},{2}};
//    int[][] arr1 = {{1,2},{2,3}};
    int[][] arr2 = {{3},{4}};
//    int[][] arr2 = {{3,4},{5,6}};
    @Test
    public void test() {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] += arr1[i][j]+arr2[i][j];
            }
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
        assertThat(true);
    }
}
