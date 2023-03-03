package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 약수의개수와덧셈 {
    int left = 13;
    int right = 17;
    @Test
    public void test() {
        int total = 0;
        for (int i = left; i <= right ; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt%2==0){
                total += i;
            }else{
                total -= i;
            }
            cnt = 0;
        }
        assertThat(total).isEqualTo(43);
    }
}
