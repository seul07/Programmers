package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _2의영역 {
//    int[] arr = {1, 2, 1, 4, 5, 2, 9};
    int[] arr = {1,1,1};
//    int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};
    @Test
    public void test() {
        int left = 0;
        int right = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==2){
                left = i;
                break;
            }
        }
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i]==2){
                right = i;
                break;
            }
        }
        int[] answer = new int[1];
        if(left==0 && right==arr.length){
            answer[0] = -1;
        }else{
            answer = new int[right-left+1];
            int cnt = 0;
            for (int i = left; i < right+1; i++) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        assertThat(true);
    }
}
