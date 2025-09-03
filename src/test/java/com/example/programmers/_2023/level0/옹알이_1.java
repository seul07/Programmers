package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 옹알이_1 {

    String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
    @Test
    public void test() {
        String[] arr = { "aya", "ye", "woo", "ma" };
        int cnt=0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(babbling[i].contains(arr[j])){
                    babbling[i] = babbling[i].replace(arr[j]," ");
                }
            }
            babbling[i]=babbling[i].trim();
            if("".equals(babbling[i])){
                cnt++;
            }
        }
        assertThat(true);
    }
}
