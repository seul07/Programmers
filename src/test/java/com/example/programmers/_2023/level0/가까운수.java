package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 가까운수 {
    int[] array = {10,11,12};
    int n = 13;
    @Test
    public void test() {
        int tmp = Integer.MAX_VALUE;
        int answer = n;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int t =  array[i]>n?array[i]-n : n-array[i];
            if(tmp>t){
                answer = array[i];
            }
            tmp = Math.min(tmp, array[i]>n?array[i]-n : n-array[i]);
        }
        System.out.println(answer);
        assertThat(true);
    }
}
