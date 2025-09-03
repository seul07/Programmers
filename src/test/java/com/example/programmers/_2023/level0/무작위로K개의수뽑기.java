package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 무작위로K개의수뽑기 {
    int[] arr = {0, 1, 1, 1, 1};
    int k = 4;
    @Test
    public void test() {
        int[] answer = new int[k];
        Arrays.fill(answer,-1);
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            final int key = arr[i];
            if(answer[cnt]==-1 && !Arrays.stream(answer).anyMatch(j->j==key)){
                answer[cnt] = arr[i];
                cnt++;
            }
            if(cnt==k){
                break;
            }
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
