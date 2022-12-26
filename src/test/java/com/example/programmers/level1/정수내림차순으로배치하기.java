package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class 정수내림차순으로배치하기 {
    int n = 118372;
    @Test
    public void test() {
        String[] arr = (n+"").split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        String tmp = String.join("",arr);
        Long answer = Long.parseLong(tmp);
        assertThat(true);
    }
}
