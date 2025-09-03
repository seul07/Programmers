package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 순서바꾸기 {
    int[] num_list = {2,1,6};
    int n = 1;
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        assertThat(true);
    }
}
