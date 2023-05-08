package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 수조작하기1 {
    int n = 0;
    String control = "wsdawsdassw";
    @Test
    public void test() {
        for (int i = 0; i < control.length(); i++) {
            if(control.charAt(i)=='w'){
                n += 1;
            }else if(control.charAt(i)=='s'){
                n -= 1;
            }else if(control.charAt(i)=='d'){
                n += 10;
            }else if(control.charAt(i)=='a'){
                n -= 10;
            }
        }
        assertThat(true);
    }
}
