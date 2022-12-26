package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 직사각형별찍기 {
    int n = 5;
    int m = 3;
    @Test
    public void test() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        assertThat(true);
    }
}
