package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 콜라츠추측 {
    int i = 6;
    @Test
    public void test() {
        int answer = 0;
        long n = (long) i;
        while(n!=1){
            if(n%2==0){
                n = n/2;
                answer++;
            }else{
                n = n*3+1;
                answer++;
            }
            if(answer>=500) {
                break;
            }
        }
        if(answer>=500){
            answer =-1;
        }
        assertThat(answer).isEqualTo(8);
    }
}
