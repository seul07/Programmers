package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetDirectionOfDot {
    int[] dot = new int[]{2,4};
    @Test
    public void test() {
        int answer = 0;
        if(dot[0]>0 && dot[1]>0){
            answer = 1;
        }else if (dot[0]<0 && dot[1]>0){
            answer = 2;
        }else if (dot[0]<0 && dot[1]<0){
            answer = 3;
        }else if (dot[0]>0 && dot[1]<0){
            answer = 4;
        }
        assertThat(true);
    }
}
