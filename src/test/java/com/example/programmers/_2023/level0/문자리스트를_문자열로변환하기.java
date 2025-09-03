package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자리스트를_문자열로변환하기 {
    String[] arr = {"a","b","c"};
    @Test
    public void test() {

        String ss = String.join("",arr);
        assertThat(true);
        System.out.println(ss);
    }
}
