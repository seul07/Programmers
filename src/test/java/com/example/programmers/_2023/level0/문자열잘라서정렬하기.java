package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 문자열잘라서정렬하기 {
    String myString = "axx";
    @Test
    public void test() {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("")){
                list.add(arr[i]);
            }
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        Arrays.sort(answer);
        assertThat(true);
    }
}
