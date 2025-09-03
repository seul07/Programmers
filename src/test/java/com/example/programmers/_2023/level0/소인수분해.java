package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 소인수분해 {
    int n = 420;
    @Test
    public void test() {
        List<Integer> list= new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while(n % i ==0){



                System.out.println(i);
                if(!list.contains(i)){
                    list.add(i);
                }
                n = n/i;
            }
        }
        int[] arr = list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(arr));
        assertThat(true);
    }
}
