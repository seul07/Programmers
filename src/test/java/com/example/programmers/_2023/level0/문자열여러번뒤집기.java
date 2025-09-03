package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열여러번뒤집기 {
    String my_string = "rermgorpsam";
    int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
    @Test
    public void test() {
        String[] strArr = my_string.split("");
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            while(left!=right){
                String tmp = strArr[left];
                strArr[left] = strArr[right];
                strArr[right] = tmp;
                left++;
                if(left==right) break;
                right--;
            }
        }
        String answer = Arrays.stream(strArr).collect(Collectors.joining());
        System.out.println(answer);
    }
}
