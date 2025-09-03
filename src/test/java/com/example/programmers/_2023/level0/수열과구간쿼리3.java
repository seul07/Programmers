package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 수열과구간쿼리3 {
    int[] arr = {0,1,2,3,4};
    int[][] queries = {{0,3},{1,2},{1,4}};
    @Test
    public void test() {
        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        assertThat(true);
    }
}
