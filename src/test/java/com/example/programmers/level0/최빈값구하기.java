package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 최빈값구하기 {
    int[] array = {1,1,2,2};
    @Test
    public void test() {
        int answer = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }
        int max = 0;
        for(int key : map.keySet()){
            if(max==map.get(key)){
                answer = -1;
            }else if(max<map.get(key)){
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
        assertThat(true);
    }
}
