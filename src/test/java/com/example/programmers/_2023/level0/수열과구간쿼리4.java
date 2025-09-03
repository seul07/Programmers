package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 수열과구간쿼리4 {
    int[] arr = {0,1,2,4,3};
    int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};
    @Test
    public void test() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < queries.length; j++) {
                int tmp = queries[j][2];
                int zero = queries[j][0];
                int one = queries[j][1];
                if(i>=zero && i<=one && i % tmp == 0){
                    arr[i]++;
                }
            }
        }
        assertThat(true);
    }
}
