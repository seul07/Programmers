package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 두수의연산값비교하기 {
    int a = 2;
    int b = 91;
    @Test
    public void test() {
        int tmp1 = Integer.parseInt(a+""+b);
        int tmp2 = 2*a*b;
        int answer = 0;
        if(tmp1>=tmp2) answer = tmp1;
        else answer = tmp2;
        assertThat(true);
    }
}
