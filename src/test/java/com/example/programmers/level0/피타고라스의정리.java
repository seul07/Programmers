package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 피타고라스의정리 {
    int a = 3;
    int c = 5;
    @Test
    public void test() {
         int b = c*c-a*a;
        System.out.println(b);
    }
}
