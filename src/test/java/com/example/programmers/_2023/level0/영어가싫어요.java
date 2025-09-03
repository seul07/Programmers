package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 영어가싫어요 {
    String numbers = "onetwothreefourfivesixseveneightnine";
    @Test
    public void test() {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Map<String,String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        for(String key : map.keySet()){
            numbers = numbers.replaceAll(key,map.get(key));
        }
        long answer = Long.parseLong(numbers);
        System.out.println(answer);
        assertThat(true);
    }
}
