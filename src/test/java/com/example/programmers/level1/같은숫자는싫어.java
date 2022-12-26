package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 같은숫자는싫어 {
    int[] arr = {4,4,4,3,3};
    @Test
    public void test() {

        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(s.size()!=0 && s.peek()!=arr[i]){
                s.add(arr[i]);
            }
        }
        int[] answer= s.stream().mapToInt(i->i).toArray();
        assertThat(true);
    }
}
