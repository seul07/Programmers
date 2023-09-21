package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 날짜비교하기 {
    int[] date1 = {2010,2,10};
    int[] date2 = {2009,12,10};
    @Test
    public void test() {
        int answer = 0;
        if(date1[0]<date2[0]){
            answer = 1;
        }else if(date1[0]==date2[0]){
            if(date1[1]<date2[1]){
                answer = 1;
            }else if(date1[1]== date2[1]){
                if(date1[2]<date2[2]){
                    answer =1;
                }
            }
        }
        assertThat(answer).isEqualTo(0);
    }
}
