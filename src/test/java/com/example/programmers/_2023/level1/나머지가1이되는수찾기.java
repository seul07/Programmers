package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 나머지가1이되는수찾기 {
    int n = 11;
    @Test
    public void test() {
        int min = Integer.MAX_VALUE;
        for (int i = n; i >= 2; i--) {
            if(n%i==1){
                min = Math.min(min,i);
            }
        }
        System.out.println(min);
        assertThat(true);
    }

}
