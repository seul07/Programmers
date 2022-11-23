package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 삼각형의완성조건_2 {
    int[] sides = {3,6};
    @Test
    public void test() {
        Arrays.sort(sides);
        int count = 0;
        // 기존 요소중 긴변이 있다면
        for (int i = sides[1]-sides[0]+1; i <= sides[1]; i++) {
            count++;
        }
        // 나머지 한 변이 가장 긴 변인경우
        for (int i = sides[1]+1; i < sides[1]+sides[0]; i++) {
            count++;
        }
        assertThat(count).isEqualTo(5);
    }
}
