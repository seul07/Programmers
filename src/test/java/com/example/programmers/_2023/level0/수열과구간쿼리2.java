package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 수열과구간쿼리2 {
    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
    @Test
    public void test() {
        int[] answer = new int[queries.length];
        Arrays.fill(answer,-1);
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1] ; j++) {
                if(arr[j]>queries[i][2]){
                    if(answer[i]==-1 || answer[i]>arr[j]){
                        answer[i] = arr[j];
                    }
                }
            }
        }
    }
}
