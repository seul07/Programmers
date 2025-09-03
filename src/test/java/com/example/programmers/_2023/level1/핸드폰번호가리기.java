package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 핸드폰번호가리기 {
    String phone_number = "01033334444";
    @Test
    public void test() {
        String tmp = phone_number.substring(0,phone_number.length()-4);
        String tmp2 = phone_number.substring(phone_number.length()-4,phone_number.length());
        tmp = tmp.replaceAll("[0-9]","*");
        String answer = tmp+tmp2;
        assertThat(true);
    }
}
