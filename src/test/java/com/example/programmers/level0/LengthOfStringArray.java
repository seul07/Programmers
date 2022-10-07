package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthOfStringArray {
    String[] strlist = new String[]{"We", "are", "the", "world!"};
    @Test
    public void test() {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
