package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 가까운1찾기 {
    int[] arr = {0,0,0,1};
    int idx = 1;
    @Test
    public void test() {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if(arr[i]==1){
                answer = i;
                break;
            }
        }
        assertThat(answer).isEqualTo(3);
    }
}
