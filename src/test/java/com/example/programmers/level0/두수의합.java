package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class 두수의합 {
    String a = "18446744073709551615";
    String b = "287346502836570928366";
    @Test
    public void test() {
        BigInteger in1 = new BigInteger(a);
        BigInteger in2 = new BigInteger(b);
        String answer = in1.add(in2)+"";
        System.out.println(answer);
        assertThat(true);
    }
}
