package com.example.programmers._2025.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 기사단원의무기 {
    int number = 10;
    int limit = 3;
    int power = 2;
    @Test
    public void test() {
        int[] divisors = new int[number];

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) count++; // 짝수 약수 처리
                }
            }
            divisors[i - 1] = count;
        }


        int result = 0;
        for (int i = 0; i < divisors.length; i++) {
            if(divisors[i]>limit){
                result += power;
            }else{
                result += divisors[i];
            }
        }
        System.out.println(result);
        assertThat(true);
    }

}
