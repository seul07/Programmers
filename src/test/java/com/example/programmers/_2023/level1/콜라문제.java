package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 콜라문제 {
    int a = 5;
    int b = 3;
    int n = 21;
    @Test
    public void test() {
        int answer = 0;
        int left = 0;
        while(n/a>0){
            answer += (n/a)*b;
            left = n%a;
            n = (n/a)*b + left;
        }
        assertThat(answer).isEqualTo(27);
    }
}
