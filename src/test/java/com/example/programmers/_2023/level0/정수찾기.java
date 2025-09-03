package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 정수찾기 {
    int[] num_list = {1,2,3,4,5};
    int n = 3;
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]==n){
                answer = 1;
            }
        }
        assertThat(answer).isEqualTo(1);
    }
}
