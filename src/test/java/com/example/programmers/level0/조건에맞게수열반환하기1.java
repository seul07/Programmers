package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 조건에맞게수열반환하기1 {
    int[] arr = {1, 2, 3, 100, 99, 98};
    @Test
    public void test() {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=50 && arr[i]%2==0){
                answer[i] = arr[i]/2;
            }else if(arr[i]<50 && arr[i]%2!=0){
                answer[i] = arr[i]*2;
            }else{
                answer[i] = arr[i];
            }
        }
        assertThat(true);
    }
}
