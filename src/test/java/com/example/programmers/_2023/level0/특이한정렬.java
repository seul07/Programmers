package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 특이한정렬 {
    int[] numlist = {10000,20,36,47,40,6,10,7000};
    int n = 30;
    @Test
    public void test() {
        int[] tmp = new int[numlist.length];
        Arrays.fill(tmp, 0);
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if(Math.abs(n-numlist[i]) >Math.abs(n-numlist[j]) ){
                    tmp[i]++;
                }else if (Math.abs(n-numlist[i])==Math.abs(n-numlist[j])){
                    if(numlist[i]<numlist[j]){
                        tmp[i]++;
                    }
                }
            }
        }
        int[] answer = new int[numlist.length];
        for (int i = 0; i < tmp.length; i++) {
            answer[tmp[i]] = numlist[i];
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
