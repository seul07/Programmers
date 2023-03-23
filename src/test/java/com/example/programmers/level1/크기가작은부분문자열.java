package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 크기가작은부분문자열 {
    String t = "10203";
    String p = "15";
    @Test
    public void test() {
        int len = p.length();
        long num = Long.parseLong(p);

        int answer = 0;

        for (int i = 0; i <= t.length()-len; i++) {
            if(Long.parseLong(t.substring(i,i+len))<=num){
                answer++;
            }

        }

        System.out.println(answer);
        assertThat(true);
    }
}
