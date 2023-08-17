package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열의길이에따라다른연산하기 {
    int[] arr = {49,12,100,276,33};
    int n = 27;
    @Test
    public void test() {
        if (arr.length%2==0){
            for (int i = 0; i < arr.length; i++) {
                if(i%2!=0){
                    arr[i] = arr[i]+n;
                }
            }
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(i%2==0){
                    arr[i] = arr[i] +n;
                }
            }
        }
        assertThat(true);
    }
}
