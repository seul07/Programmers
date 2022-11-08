package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 한번만등장한수 {
    String s = "abdc";

    @Test
    public void test() {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)+"")){
                map.put(s.charAt(i)+"",map.get(s.charAt(i)+"")+1);
            }else{
                map.put(s.charAt(i)+"",1);
            }
        }
        String answer = "";
        for(String key : map.keySet()){
            if(map.get(key)==1){
                answer += key;
            }
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        System.out.println(answer);
        assertThat(true);
    }
}

