package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class 배열만들기6 {
    int[] arr = {0, 1, 1, 1, 0};
    @Test
    public void test() {
        int i = 0;
        List<Integer> list =  new ArrayList<>();
        System.out.println(i);
        System.out.println(arr.length);
         while(i<arr.length){
            if(list.size()==0){
                list.add(arr[i]);
            }else if(list.get(list.size()-1)==arr[i]){
                list.remove(list.size()-1);
            }else if(list.get(list.size()-1)!=arr[i]){
                list.add(arr[i]);
            }
             i++;
        }
         int[] stk = list.stream().mapToInt(j->j).toArray();

         if(stk.length==0){
             int[] answer = {-1};
             stk = answer;
         }
        System.out.println(Arrays.toString(stk));
    }
}
