package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 특정한문자를대문자로바꾸기 {
    String my_string = "programmers";
    String alp = "p";
    @Test
    public void test() {
        String result = "";
        result = my_string.replaceAll(alp,alp.toUpperCase());
        assertThat(true);
    }
}
