package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 진료순서정하기 {
    int[] emergency = {3,76,24};
    @Test
    public void test() {
        Map<Integer,Integer> map = new HashMap<>();
        int[] tmp = emergency.clone();
        Arrays.sort(tmp);
        int n = tmp.length;
        for (int i = 0; i < tmp.length; i++) {
            map.put(tmp[i],n);
            n=n-1;
        }
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
