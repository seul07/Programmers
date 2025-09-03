package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 홀수vs짝수 {
   int[] num_list = {4,2,6,1,7,6};
    @Test
    public void test() {
        int answer = 0;
        int odd=0;
        int eve=0;
        for (int i = 0; i < num_list.length; i++) {
            if(i%2==0){
                eve += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        if(eve>odd) answer = eve;
        else if(eve<odd) answer = odd;
        else answer = eve;
        assertThat(answer).isEqualTo(17);
    }
}
