package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 콜라츠수열만들기 {
    int n = 10;
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            if(n%2==0){
               n = n/2;
               list.add(n);
            }else{
                n = 3*n+1;
                list.add(n);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
