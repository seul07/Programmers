package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class n보다커질때까지더하기 {
    int[] numbers = {58, 44, 27, 10, 100};
    int n = 139;
    @Test
    public void test() {
        int answer = 0;
        int cnt = 0;
        while(answer<n){
            answer += numbers[cnt];
            cnt++;
        }
        if(answer<=n){
            answer += numbers[cnt];
        }
        System.out.println(answer);
        assertThat(true);
    }
}
