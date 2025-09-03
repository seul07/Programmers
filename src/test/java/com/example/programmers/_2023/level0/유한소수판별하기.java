package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 유한소수판별하기 {
    int a = 7;
    int b = 20;
    @Test
    public void test() {
        for (int i = 2; i <= a; i++) {
            if(a%i==0 && b%i==0){
                a = a/i;
                b = b/i;
            }
        }
        int answer = 2;
        if(b>0 && b%5==0){
            while(b%5==0){
                b = b/5;
            }
        }
        if(b>0 && b%2==0){
            while(b%2==0){
                b = b/2;
            }
        }
        if(b==1){
            answer = 1;
        }else{
            answer = 2;
        }
        assertThat(answer).isEqualTo(1);
    }
}
