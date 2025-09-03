package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열의길이를2의거듭제곱으로만들기 {
    int[] arr = {1,2,3,4,5,6};
    @Test
    public void test() {
        int len = arr.length;
        int minLenght = 1;
        while(minLenght < len){
            minLenght *= 2;
        }
        List<Integer> list  = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < minLenght-len; i++) {
            list.add(0);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        assertThat(true);
    }
}
