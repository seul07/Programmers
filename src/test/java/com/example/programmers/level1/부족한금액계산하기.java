package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 부족한금액계산하기 {
    int price = 3;
    int money = 20;
    int count = 4;
    @Test
    public void test() {
        long answer = 0;
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += price*i;
        }
        if(total>money){
            answer = Math.abs(total-money);
        }else{
            answer = 0;
        }
        assertThat(answer).isEqualTo(10);
    }
}
