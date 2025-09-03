package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열만들기2 {
    int l = 5;
    int r = 555;
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String tmp = i+"";
            String[] arr = tmp.split("");
            boolean result = true;
            for (int j = 0; j < arr.length; j++) {
                if(!arr[j].equals("0")&&!arr[j].equals("5")){
                    result = false;
                }
            }
            if(result){
                list.add(i);
            }
        }
        if(list.size()>0){
            int[] answer = list.stream().mapToInt(i->i).toArray();
        }else{
            int[] answer = new int[]{-1};
        }

        assertThat(true);
    }
}
