package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 로또의최고순위와최저순위 {
    int[] lottos = {0,0,0,0,0,0};
//    int[] lottos = {44,1,0,0,31,25};
    int[] win_nums = {31,10,45,1,6,19};
    @Test
    public void test() {
        int min = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i]==0) zero++;
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i]==win_nums[j]){
                    min++;
                }
            }
        }
        int max = min;
        if(max<5){
            max += zero;
        }
        int[] answer = new int[2];
        answer[0] = getNumber(max);
        answer[1] = getNumber(min);

        assertThat(true);
    }

    private int getNumber(int num) {
        switch (num){
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default:
                return 6;
        }
    }
}
