package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class 왼쪽오른쪽 {
    String[] str_list = {"u", "u", "r", "l"};
    @Test
    public String[] test() {
        int cnt = 0;
        String[] result = {};
        while(cnt<str_list.length){
            if("l".equals(str_list[cnt])){
                return Arrays.copyOfRange(str_list,0,cnt);
            }else if("r".equals(str_list[cnt])){
                return Arrays.copyOfRange(str_list,cnt+1,str_list.length);
            }
            cnt++;
        }
        return result;
    }
}
