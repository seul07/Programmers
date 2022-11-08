package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 팩토리얼 {
    int n = 3628800;
    @Test
    public void test() {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if(n>= getFacto(i)){
                answer = i;
            }else{
                break;
            }
        }
        assertThat(true);
    }

    private int getFacto(int num) {
        if(num>1) return num*getFacto(num-1);
        return num;
    }


}
