package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class A강조하기 {
    String myString = "abstract algebra";
    @Test
    public void test() {
        myString = myString.toLowerCase();
        myString = myString.replaceAll("a","A");
        assertThat(true);
    }
}
