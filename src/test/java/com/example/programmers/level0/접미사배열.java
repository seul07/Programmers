package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 접미사배열 {
    String my_string = "banana";
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add(my_string);
        while(my_string.length()>0){
            my_string = my_string.substring(1);
            if(!my_string.equals("")){
                list.add(my_string);
            }
        }
        String[] answer = list.stream().toArray(String[]::new);
        Arrays.sort(answer);
        assertThat(true);
    }
}
