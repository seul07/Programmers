package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 토너먼트경기수 {
    int n = 7;
    @Test
    public void test() {
        int answer = 0;
        while(n>1){
            answer += n/2;
            if(n%2==0){
                n = n/2;
            }else{
                n = (n-1)/2 +1;
            }
        }
        System.out.println(answer);
        assertThat(true);
    }
}
