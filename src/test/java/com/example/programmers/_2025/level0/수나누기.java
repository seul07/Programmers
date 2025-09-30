package com.example.programmers._2025.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 수나누기 {
    @Test
    public void test() {
        int number = 4859;
        int answer = 0;
        for(int i=0; i<number; i++){
            answer += number % 100;
            number /= 100;
        }


        System.out.println(answer);
        assertThat(true);
    }

}
