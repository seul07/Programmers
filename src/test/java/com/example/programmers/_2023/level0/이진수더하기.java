package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 이진수더하기 {
    String bin1 = "10";
    String bin2 = "11";
    @Test
    public void test() {
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        int result = num1+num2;
        String answer = Integer.toBinaryString(result);
        System.out.println(answer);
        assertThat(true);
    }
}
