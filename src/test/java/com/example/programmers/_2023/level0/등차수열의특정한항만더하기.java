package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 등차수열의특정한항만더하기 {
    int a = 3;
    int d = 4;
    boolean[] included = {true, false, false, true, true};
    @Test
    public void test() {
        int answer = 0;
        int[] arr = new int[included.length];
        arr[0] = a;
        for (int i = 1; i < included.length; i++) {
            arr[i] = arr[i-1]+d;
        }
        for (int i = 0; i < included.length; i++) {
            if(included[i]){
                answer += arr[i];
            }
        }
        assertThat(true);
    }
}
