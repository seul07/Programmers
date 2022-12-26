package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class 겹치는선분의길이 {
    int[][] lines = {{0,5},{3,9},{1,10}};
    @Test
    public void test() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] line : lines) {
            int from = Math.min(line[0], line[1]);
            int to = Math.max(line[0], line[1]);
            for (int i = from; i < to; i++) {
                map.merge(i, 1, Integer::sum);
            }
        }
        int answer = (int) map.values().stream().filter(i -> i > 1).count();
        assertThat(true);
    }
}
