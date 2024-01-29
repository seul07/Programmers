package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

public class 정사각형으로만들기 {
    int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
    @Test
    public void test() {
        int size = Math.max(arr.length,arr[0].length);
        int[][] answer = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i],0,answer[i],0,arr[0].length);
        }
    }
}
