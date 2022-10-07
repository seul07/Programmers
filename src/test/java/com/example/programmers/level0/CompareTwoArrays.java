package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareTwoArrays {
    String[] s1 = new String[]{"a","b", "c"};
    String[] s2 = new String[]{"com", "b", "d", "p", "c"};
    @Test
    public void test() {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])){
                    answer++;
                }
            }
        }

        assertThat(answer).isEqualTo(2);
    }
}
