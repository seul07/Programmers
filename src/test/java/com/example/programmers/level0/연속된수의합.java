package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 연속된수의합 {
    int num = 5;
    int total = 15;
    @Test
    public void test() {
        int[] answer = new int[num];
        int temp = 0;
        for(int i=0;i<num;i++){
            temp+=i;
        }
        int value = (total-temp)/num;

        for(int i=0;i<num;i++){
            answer[i]=i+value;
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
