package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열계산하기 {
    String my_string="3 + 5";
    @Test
    public void test() {
        String[] arr = my_string.split(" ");
        int answer= Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if("+".equals(arr[i-1])){
                answer += Integer.parseInt(arr[i]);
            }else if("-".equals(arr[i-1])){
                answer -= Integer.parseInt(arr[i]);
            }
        }
        System.out.println(answer);
        assertThat(true);
    }
}
