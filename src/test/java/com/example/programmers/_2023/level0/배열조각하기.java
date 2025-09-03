package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class 배열조각하기 {
    int[] arr = {0, 1, 2, 3, 4, 5};
    int[] query = {4,1,2};
    @Test
    public void test() {
        for (int i = 0; i < query.length; i++) {
            // 짝수
            if(i%2==0){
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            // 홀수
            }else{
                arr = Arrays.copyOfRange(arr,query[i],arr.length);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
