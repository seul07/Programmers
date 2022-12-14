package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 저주의숫자3 {
    int n = 40;
    @Test
    public void test() {
        int answer=0;
        for (int i = 1; i <= n ; i++) {
            answer++;
            String tmp = answer+"";
            while(answer%3==0 || tmp.contains("3")){
                answer+=1;
                tmp = answer+"";
            }
        }
        assertThat(true);
    }
}
