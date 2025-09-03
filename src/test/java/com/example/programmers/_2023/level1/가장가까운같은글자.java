package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class 가장가까운같은글자 {
    String s = "foobar";
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)+"")==null){
                list.add(-1);
            }else{
                list.add(map.get(s.charAt(i)+""));
                map.put(s.charAt(i)+"",0);
            }
            for (String s1 : map.keySet()) {
                map.put(s1,map.get(s1)+1);
            }
            Integer tmp = map.get(s.charAt(i)+"");
            if(tmp==null)map.put(s.charAt(i)+"",1);
        }
        assertThat(true);
    }
}
