package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 예산 {
    int[] d = {1,3,2,5,4};
    int budget = 9;
    @Test
    public void test() {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++){
            result+=d[i];
            if(result > budget){
                answer=i;
                break;
            }
        }
        if(result <= budget){
            answer = d.length;
        }
        System.out.println(answer);
        assertThat(true);
    }
}
