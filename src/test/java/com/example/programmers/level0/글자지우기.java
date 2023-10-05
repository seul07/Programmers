package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class 글자지우기 {
    String my_string = "apporoograpemmemprs";
    int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
    @Test
    public void test() {
        String[] arr = my_string.split("");
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]]="";
        }
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        assertThat(true);
    }
}
