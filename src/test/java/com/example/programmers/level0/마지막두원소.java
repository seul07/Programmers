package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 마지막두원소 {
    int[] num_list = {2,1,6};
    @Test
    public void test() {
        int[] answer = new int[num_list.length+1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        if(num_list[num_list.length-1]>num_list[num_list.length-2]){
            answer[answer.length-1] = num_list[num_list.length-1]-num_list[num_list.length-2];
        }else{
            answer[answer.length-1] = num_list[num_list.length-1]*2;
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
