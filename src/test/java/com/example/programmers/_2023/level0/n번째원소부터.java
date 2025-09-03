package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class n번째원소부터 {
    int[] num_list = {2,1,6};
    int n = 3;
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = n-1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
