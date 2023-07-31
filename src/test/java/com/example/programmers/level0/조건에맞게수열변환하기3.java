package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 조건에맞게수열변환하기3 {
    int[] arr = {1, 2, 3, 100, 99, 98};
    int k = 3;
    @Test
    public void test() {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(k%2==0){
                answer[i] = arr[i]+k;
            }else{
                answer[i] = arr[i]*k;
            }
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
