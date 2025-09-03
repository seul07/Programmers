package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 커피심부름 {
    String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < order.length; i++) {
            if(order[i].contains("cafelatte")){
                answer += 5000;
            }else{
                answer += 4500;
            }
        }
        assertThat(answer).isEqualTo(19000);
    }
}
