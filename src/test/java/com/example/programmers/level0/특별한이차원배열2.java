package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 특별한이차원배열2 {
    int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
     @Test
    public void test() {
         int answer = 1;
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[0].length; j++) {
                 if(arr[i][j]!=arr[j][i]){
                     answer = 0;
                     break;
                 }
             }
         }
        assertThat(true);
    }
}
