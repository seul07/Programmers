package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 나누어떨어지는숫자배열 {
    int[] arr = {5, 9, 7, 10};
    int divisor = 5;
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        int[] answer;
        if(list.size()>0){
           answer = list.stream().mapToInt(i->i).toArray();
            Arrays.sort(answer);
        }else{
            answer = new int[]{-1};
        }
        assertThat(true);
    }
}
