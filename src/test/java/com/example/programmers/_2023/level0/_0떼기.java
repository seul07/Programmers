package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _0떼기 {
    String n_str = "0010";
    @Test
    public void test() {
        String[] arr = n_str.split("");
        if(n_str.startsWith("0")){
            int cnt = 0;
            while(arr[cnt].equals("0")){
                arr[cnt] = "";
                cnt++;
            }
        }
        String answer = String.join("",arr);
        assertThat(true);
    }
}
