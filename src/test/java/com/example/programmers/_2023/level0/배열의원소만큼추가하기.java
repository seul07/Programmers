package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열의원소만큼추가하기 {
    int[] arr = {5,1,4};
    @Test
    public void test() {
        int len = IntStream.of(arr).sum();
        int[] answer = new int[len];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        assertThat(true);
    }
}
