package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 제일작은수제거하기 {
    int[] arr = {4,3,2,1};
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int[] answer;
        if(arr.length>1){
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
                min = Math.min(min, arr[i]);
            }
            list.remove(list.indexOf(min));
            answer = list.stream().mapToInt(i->i).toArray();

        }else{
            answer = new int[]{-1};
        }
        assertThat(true);
    }
}
