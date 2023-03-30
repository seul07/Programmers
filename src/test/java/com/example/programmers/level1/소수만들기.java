package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 소수만들기 {
    int[] nums = {1,2,7,6,4};
    @Test
    public void test() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        int answer = 0;
        for(int s : list){
            if(s==2) continue;
            int cnt = 0;
            for(int i = 1; i <= s; i++){
                if(s % i == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                answer++;
            }
        }
        assertThat(true);
    }
}
