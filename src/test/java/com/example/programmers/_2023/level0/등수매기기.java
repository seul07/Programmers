package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 등수매기기 {
//    int[][] score = {{80,70},{90,50},{40,70},{50,80}};
    int[][] score = {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}};
    @Test
    public void test() {
        int[] answer = new int[score.length];
        Arrays.fill(answer, 1);
        int[] sum = new int[answer.length];
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0]+score[i][1];
        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
               if(score[i][0] + score[i][1] > score[j][0] + score[j][1]) {
                    answer[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }


}
