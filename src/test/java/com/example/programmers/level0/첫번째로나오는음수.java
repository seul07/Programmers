package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 첫번째로나오는음수 {
    int[] num_list = {12, 4, 15, 46, 38, -2, 15};
    @Test
    public void test() {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]<0){
                answer = i;
                break;
            }
        }
        assertThat(true);
    }
}
