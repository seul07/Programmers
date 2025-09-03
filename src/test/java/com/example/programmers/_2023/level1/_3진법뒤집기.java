package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3진법뒤집기 {
    int n = 125;
    @Test
    public void test() {
        String three = Integer.toString(n,3);
        StringBuffer sb = new StringBuffer(three);
        String reversedStr = sb.reverse().toString();
        int result = Integer.parseInt(reversedStr,3);

        assertThat(result).isEqualTo(229);
    }
}
