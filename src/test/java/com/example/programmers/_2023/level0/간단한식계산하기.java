package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 간단한식계산하기 {
    String binomial = "43 + 12";
    @Test
    public void test() {
        String[] arr = binomial.split(" ");
        int answer = 0;
        if("+".equals(arr[1])){
            answer = Integer.parseInt(arr[0]) +Integer.parseInt(arr[2]);
        }else if("-".equals(arr[1])){
            answer = Integer.parseInt(arr[0]) -Integer.parseInt(arr[2]);
        }else if("*".equals(arr[1])){
            answer = Integer.parseInt(arr[0]) *Integer.parseInt(arr[2]);
        }
        System.out.println(answer);
        assertThat(true);
    }
}
