package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열만들기3 {
    int[] arr = {1,2,3,4,5};
    int[][] intervals = {{1,3},{0,4}};
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            list.add(arr[i]);
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            list.add(arr[i]);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        assertThat(true);
    }
}
