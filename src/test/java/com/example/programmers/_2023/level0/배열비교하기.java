package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열비교하기 {
    int[] arr1 = {49,13};
    int[] arr2 = {70,11,2};
    @Test
    public void test() {
        int answer = 0;
        if(arr1.length==arr2.length){
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if(sum1==sum2){
                answer = 0;
            }else if(sum1>sum2){
                answer = 1;
            }else{
                answer = -1;
            }
        }else{
            if(arr1.length>arr2.length){
                answer = 1;
            }else{
                answer = -1;
            }
        }
        assertThat(true);
    }

    @Test
    public void test2() {
        int answer = Integer.compare(arr1.length,arr2.length);
        if(answer==0){
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }
        assertThat(true);
    }
}
