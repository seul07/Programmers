package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 음양더하기 {
    int[] absolutes = {4,7,12};
    boolean[] signs = {true,false,true};
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        assertThat(answer).isEqualTo(9);
    }
}
