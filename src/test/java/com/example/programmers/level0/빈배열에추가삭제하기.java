package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 빈배열에추가삭제하기 {
    int[] arr = {3,2,4,1,3};
    boolean[] flag = {true,false,true,false,false};
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if(flag[i]){
                for (int j = 0; j < arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            }else{
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size()-1);
                }
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        assertThat(true);
    }
}
