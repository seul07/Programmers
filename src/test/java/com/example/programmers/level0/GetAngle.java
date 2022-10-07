package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class GetAngle {
    int angle = 70;
    @Test
    public void test() {
        int answer = 0;
        if(0<angle && angle<90){
            answer = 1;
        }else if (angle==90){
            answer = 2;
        }else if (angle > 90 && angle<180){
            answer = 3;
        }else if (angle==180){
            answer = 4;
        }
        assertThat(true);
    }

    String my_string = "jaron";
    @Test
    public void test2() {
        String[] list =  my_string.split("");
        String s = "";
        for (int i = list.length-1; i >=0; i--) {
            s += list[i];
        }
        System.out.println(s);
        assertThat(true);
    }
}
