package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1로만들기 {
    int[] num_list = {12, 4, 15, 1, 14};
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            int tmp = num_list[i];
            while(tmp!=1){
                if(tmp%2==0){
                    tmp=tmp/2;
                }else{
                    tmp=(tmp-1)/2;
                }
                answer++;
            }
        }
        assertThat(true);
    }
}
