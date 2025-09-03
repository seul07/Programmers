package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 수열과구간쿼리1 {
    int[] arr = {1,2,3,4,5};
    int[][] queries = {{2,4}};
    @Test
    public void test() {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1] ; j++) {
                arr[j]=arr[j]+1;
            }
        }
        System.out.println(Arrays.toString(arr));
        assertThat(true);
    }
}
