package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 주사위게임2 {
    int a = 2;
    int b = 6;
    int c = 1;
    @Test
    public void test() {
        int answer = 0;
        if(a!=b && a!=c && b!=c){
            answer = a+b+c;
        }else if((a!=b && a!=c && b==c) || (a==b && a!=c && b!=c) || (a!=b && a==c && b!=c) ){

            Double tmp = Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2);
            answer = (a+b+c)*(tmp.intValue());
        }else if(a == b && a==c && b==c){
            Double tmp1 = Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2);
            Double tmp2 = Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
            answer = (a+b+c)*(tmp1.intValue())*(tmp2.intValue());
        }
        assertThat(9).isEqualTo(answer);
    }
}
