package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 이어붙인수 {
    int[] num_list = {3,4,5,2,1};
    @Test
    public void test() {
        String odd = "";
        String even = "";
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2==0){
                even += num_list[i];
            }else{
                odd += num_list[i];
            }
        }
        int answer = Integer.parseInt(even)+Integer.parseInt(odd);
        assertThat(answer).isEqualTo(393);
    }
}
