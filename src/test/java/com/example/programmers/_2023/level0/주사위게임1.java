package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 주사위게임1 {
    int a = 3;
    int b = 5;
    @Test
    public void test() {
        int answer = 0;
        if(a%2!=0 && b%2!=0){
            answer = (a*a)+ (b*b);
        }else if( (a%2==0 && b%2!=0) || (a%2!=0 && b%2==0) ){
            answer= 2*(a+b);
        }else if(a%2==0 && b%2==0){
            answer = a-b;
        }
        if(answer<0){
            answer = (-1)*answer;
        }
        assertThat(answer).isEqualTo(34);
    }
}
