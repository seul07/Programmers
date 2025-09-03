package com.example.programmers._2025.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 택배상자꺼내기 {
    int n = 22;
    int w = 6;
    int num = 8;
//    int n = 100;
//    int w = 9;
//    int num =47;
    // 기대값 6
    @Test
    public void test() {
        int answer = 0; // 꺼내려는 상자의 갯수
        int row = (num-1)/w; // 꺼내려는 상자의 행 계산
        int wIdx = w-1; // 가로 인덱스
        int col = 0; // 꺼내려는 상자의 열

        if (row%2 == 0) {
            col = (num-1) % w;
        } else {
            col = wIdx - (num-1) % w;
        }
        for (; row < (n+wIdx)/w; row++) {
            int aboveBox = 0;
            if (row % 2 == 0) {
                aboveBox = col + (row * w);
            } else {
                aboveBox = (wIdx - col) + (row * w);
            }
            if (aboveBox < n) {
                answer++;
            }
        }
        System.out.println(answer);
    }

}
