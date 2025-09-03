package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 수조작하기2 {
    int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
    @Test
    public void test() {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            if(numLog[i-1]+1==numLog[i]){
                answer += "w";
            }else if(numLog[i-1]-1==numLog[i]){
                answer += "s";
            }else if(numLog[i-1]+10==numLog[i]){
                answer += "d";
            }else if(numLog[i-1]-10==numLog[i]){
                answer += "a";
            }
        }
        assertThat(true);
    }
}
