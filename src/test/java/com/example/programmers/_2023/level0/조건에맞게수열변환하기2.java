package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 조건에맞게수열변환하기2 {
    int[] arr = {1,2,3,100,99,98};
    @Test
    public void test() {
        boolean result = true;
        int cnt = 0;
        while(result){
            int[] arr2 = Arrays.copyOf(arr,arr.length);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] = arr[i]/2;
                }else if(arr[i]<50 && arr[i]%2!=0){
                    arr[i] = arr[i]*2+1;
                }
            }
            if(Arrays.equals(arr,arr2)){
                result = false;
            }
            cnt++;
        }
        int answer = cnt-1;
        assertThat(true);
    }
}
