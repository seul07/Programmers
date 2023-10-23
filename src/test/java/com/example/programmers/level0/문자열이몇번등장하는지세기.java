package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열이몇번등장하는지세기 {
    String myString = "aaaa";
    String pat = "aa";
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < myString.length(); i++) {
            int lastIdx = i+pat.length() > myString.length() ? myString.length() : i+pat.length();
            String tmp = myString.substring(i,lastIdx);
            if(tmp.equals(pat)){
                answer++;
            }
        }
        assertThat(true);
    }
}
