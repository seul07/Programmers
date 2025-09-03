package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 세로읽기{
    String my_string = "programmers";
    int m = 1;
    int c = 1;
    @Test
    public void test() {
        String answer = "";
        List<String> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < my_string.length()/m; i++) {
            list.add(my_string.substring(index,index+m));
            index = index+m;
        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i).charAt(c-1);
        }

        assertThat(true);
    }
}
