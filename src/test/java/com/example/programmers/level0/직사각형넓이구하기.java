package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 직사각형넓이구하기 {
    int[][] dots = {{1,1},{2,1},
                    {2,2},{1,2}};
//    int[][] dots = {{-1,-1},{1,1},
//            {1,-1},{-1,1}};
    @Test
    public void test() {
        int garoMax = Integer.MIN_VALUE;
        int garoMin = Integer.MAX_VALUE;
        int seroMax = Integer.MIN_VALUE;
        int seroMin = Integer.MAX_VALUE;
        for (int i = 0; i < dots.length; i++) {
            garoMax = Math.max(garoMax,dots[i][0]);
            garoMin = Math.min(garoMin,dots[i][0]);
            seroMax = Math.max(seroMax,dots[i][1]);
            seroMin = Math.min(seroMin,dots[i][1]);
        }
        int answer = (garoMax-garoMin)*(seroMax-seroMin);
        assertThat(answer).isEqualTo(1);
    }
}
