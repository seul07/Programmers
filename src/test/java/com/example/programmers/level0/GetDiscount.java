package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetDiscount {
    int price = 580000;
    @Test
    public void test() {
        int answer = 0;
        if (price >=500000){
            answer =  (int)((int)price*0.8);
        }else if (price >=300000) {
            answer = (int)((int)price * 0.9);
        }else if(price>=100000){
            answer = (int)((int)price*0.95);
        }

        assertThat(true);
    }

}
