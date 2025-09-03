package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열에서문자열대소문자변환하기 {
    String[] strArr = {"AAA","BBB","CCC","DDD"};
    @Test
    public void test() {
        String[] answer = strArr;
        for (int i = 0; i < strArr.length; i++) {
            if(i%2==0){
                answer[i] = strArr[i].toLowerCase();
            }else{
                answer[i] = strArr[i].toUpperCase();
            }
        }
        assertThat(true);
    }
}
