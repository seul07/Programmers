package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class OX퀴즈 {
    String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
    @Test
    public void test() {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(" ");
            int result = 0;
            if("+".equals(tmp[1])){
                result = Integer.parseInt(tmp[0])+Integer.parseInt(tmp[2]);
            }else{
                result = Integer.parseInt(tmp[0])-Integer.parseInt(tmp[2]);
            }

            if(result==Integer.parseInt(tmp[4])){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
        }

        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
