package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 최소직사각형 {
    int[][] sizes = {{10,7},
                    {12,3},
                    {8,15},
                    {14,7},
                    {5,15}};
    @Test
    public void test() {
        int maxW = 0;
        int maxH = 0;
        for (int i = 0; i < sizes.length; i++) {
            int tmp = sizes[i][0];
            if(sizes[i][0]>sizes[i][1]){
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            maxW = Math.max(maxW,sizes[i][0]);
            maxH = Math.max(maxH,sizes[i][1]);
        }

        int result= maxW*maxH;

        assertThat(result).isEqualTo(120);
    }
}
