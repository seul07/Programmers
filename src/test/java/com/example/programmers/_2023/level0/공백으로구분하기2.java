package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 공백으로구분하기2 {
    String my_string = " i    love  you";
    @Test
    public void test() {
        String[] arr = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!"".equals(arr[i])){
                list.add(arr[i]);
            }
        }
        String[] answer =  list.toArray(new String[0]);
        assertThat(true);
    }
}
