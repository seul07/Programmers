package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 다음에올숫자 {
    int[] common = {2,4,8};
    @Test
    public void test() {
        int ex1 = common[2]-common[1];
        int ex2 = common[1]-common[0];
        int answer = 0;
        if(ex1==ex2){
            answer = common[common.length-1]+ex1;
        }else{
            answer = common[common.length-1]*(common[1]/common[0]);
        }
        System.out.println(answer);
        assertThat(true);
    }
}
