package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class 문자열묶기 {
    String[] strArr = {"a","bc","d","efg","hi"};
    @Test
    public void test() {
        int[] arr = new int[30];
        for (int i = 0; i < strArr.length; i++) {
            arr[strArr[i].length()]++;
        }
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if(answer<arr[i]) answer = arr[i];
        }
        assertThat(true);
    }
}
