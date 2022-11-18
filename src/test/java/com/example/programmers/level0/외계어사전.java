package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 외계어사전 {
    String[] spell = {"p", "o", "s"};
    String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
    @Test
    public void test() {
        int answer = 2;
        for (int j = 0; j < dic.length; j++) {
            int cnt = 0;
            for (int i = 0; i < spell.length; i++) {
                if(dic[j].contains(spell[i])){
                    cnt++;
                }
            }
            if(cnt==spell.length){
                answer = 1;
                break;
            }
        }
        assertThat(true);
    }
}
