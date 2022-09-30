package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseAndArray {
    int n = 12345;
    @Test
    public void test() {
        String s = n+"";
        String[] arr = s.split("");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        int[] result= new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = Integer.parseInt(list.get(i));
        }
        /**
         * 아래 풀이의 문제점
         * long => int 로 변환할 경우  int 가 담을 수 없는 숫자 일경우 오류 발생
         */
//        int[] arr = new int[(int) (Math.log10(n)+1)];
//        int i=0;
//        while(n>0){
//            arr[i]=(int)n%10;
//            n = n/10;
//            i++;
//        }
        System.out.println(Arrays.toString(result));
        assertThat(true);
    }
}
