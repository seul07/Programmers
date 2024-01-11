package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기4 {
    int[] arr = {1, 4, 2, 5, 3};
    int i = 0;
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        while(i<arr.length){
            if(list.size()==0){
                list.add(arr[i]);
                i++;
            }else if(list.size()>0 && list.get(list.size()-1)<arr[i]){
                list.add(arr[i]);
                i++;
            }else if(list.size()>0 && list.get(list.size()-1)>=arr[i]){
                list.remove(list.size()-1);
            }
        }
        int[] stk = list.stream().mapToInt(i->i).toArray();
    }
}
