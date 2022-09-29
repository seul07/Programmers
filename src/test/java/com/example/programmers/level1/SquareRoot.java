package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareRoot {
    /**
     * Math.sqrt() : 제곱근(루트) 함수
     *  => double 로 리턴
     *  => 리턴되는 값이 정수(int) 여야 제곱근이 해당된다.
     * Math.pow(double a,double b) : 제곱함수
     *  => power : 거듭제곱
     *  => a 의 b 제곱 리턴
     * */
    int n = 4;

    @Test
    public void test() {
        long m = -1;
        long number1 = (long)Math.sqrt(n);
        if(Math.pow(number1,2) == n ){
            m = (long)Math.pow(number1 +1,2);
        }

        System.out.println("number1 : "+number1);
        System.out.println("m : "+m);


        System.out.println("=====================");
        long answer2 = -1;
        double number = Math.sqrt(n);
        int sq2 = (int)number;
        if(number==sq2){
            answer2 = (long)Math.pow(sq2+1,2);
        }else{
            answer2 = -1;
        }
        System.out.println("number : "+number);
        System.out.println("answer2 : "+answer2);
        assertThat(answer2).isEqualTo(144);
    }
}
