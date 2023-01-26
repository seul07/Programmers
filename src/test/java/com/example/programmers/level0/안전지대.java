package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 안전지대 {
    int[][]  arr= {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
    @Test
    public void test() {
        int[] x = {-1,-1,-1,0,0,1,1,1};
        int[] y = {-1,0,1,-1,1,-1,0,1};
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==1){
                    for (int k = 0; k < x.length; k++) {
                            if(i+x[k]>=0 && j+y[k]>=0 && i+x[k]<arr.length && j+y[k] <arr[0].length){
                                if(arr[i+x[k]][j+y[k]]==0){
                                    arr[i+x[k]][j+y[k]] = 2;
                                }
                            }
                    }

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==0)
                    answer++;
            }
        }

        assertThat(true);
    }
}
