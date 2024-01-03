package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class qrcode {
    int q = 3;
    int r = 1;
    String code = "qjnwezgrpirldywt";
    @Test
    public void test() {
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if(i%q == r){
                answer += code.charAt(i);
            }
        }
        assertThat(true);
    }
}
