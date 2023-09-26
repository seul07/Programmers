package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열만들기5 {
    String[] intStrs = {"0123456789","9876543210","9999999999999"};
    int k = 50000;
    int s = 5;
    int l = 5;
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            String tmp = intStrs[i].substring(s,s+l);
            int num = Integer.parseInt(tmp);
            if(k<num){
                list.add(num);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
