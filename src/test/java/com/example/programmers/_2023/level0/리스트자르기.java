package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 리스트자르기 {
    int n = 2;
    int[] slicer = {0,1,1};
    int[] num_list = {10,8,6,4,2};
//    int n = 3;
//    int[] slicer = {1,5,2};
//    int[] num_list = {1,2,3,4,5,6,7,8,9};
    @Test
    public void test() {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        List<Integer> list = new ArrayList<>();
        if(n==1){
            for (int i = 0; i <= b; i++) {
                list.add(num_list[i]);
            }
        }else if(n==2){
            for (int i = a; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        }else if(n==3){
            for (int i = a; i <= b ; i++) {
                list.add(num_list[i]);
            }
        }else if(n==4){
            for (int i = a; i <= b ; i = i+c) {
                list.add(num_list[i]);
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));

        assertThat(true);
    }

}
