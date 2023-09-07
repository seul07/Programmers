package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 할일목록 {
    String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
    boolean[] finished = {true, false, true, false};
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        System.out.println(list);
        String[] answer = new String[list.size()];
        list.toArray(answer);
        assertThat(true);
    }
}
