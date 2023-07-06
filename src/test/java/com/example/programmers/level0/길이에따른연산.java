package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 길이에따른연산 {
    int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
    @Test
    public void test() {
        int result = 0;
        if(num_list.length>=11){
            for (int i = 0; i < num_list.length; i++) {
                result += num_list[i];
            }
        }else if(num_list.length<=10){
            result = 1;
            for (int i = 0; i < num_list.length; i++) {
                result *= num_list[i];
            }
        }
        assertThat(result).isEqualTo(51);
    }
}
