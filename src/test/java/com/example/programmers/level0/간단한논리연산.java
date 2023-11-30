package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 간단한논리연산 {
    boolean x1 = false;
    boolean x2 = true;
    boolean x3 = true;
    boolean x4 = true;
    @Test
    public void test() {
        boolean result = (x1 || x2) && ( x3 || x4);
        System.out.println(result);
        assertThat(true);
    }
}
