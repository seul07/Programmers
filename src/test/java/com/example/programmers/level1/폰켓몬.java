package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class 폰켓몬 {
    int[] nums = {3,3,3,2,2,2};
    @Test
    public void test() {
        int max = nums.length/2;
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],0);
        }
        int result = 0;
        if(max<map.size()){
            result = max;
        }else{
            result = map.size();
        }
        System.out.println(result);
    }
}
