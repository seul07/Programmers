package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 홀짝에따라다른값반환하기 {
    int n = 10;
    @Test
    public void test() {
        int answer = 0;
        if(n%2==0){
            for (int i = 1; i <= n ; i++) {
                if(i%2==0){
                    answer += i*i;
                }
            }
        }else{
            for (int i = 1; i <= n ; i++) {
                if(i%2!=0){
                    answer += i;
                }
            }
        }
        assertThat(true);
    }
}
