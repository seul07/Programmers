package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class 캐릭터좌표 {
    String[] keyinput = {"left", "left", "left", "right"};
    int[] board = {3,3};
    @Test
    public void test() {
        int garo = 0;
        int sero = 0;
        int garoAbs = (board[0]-1)/2;
        int seroAbs = (board[1]-1)/2;
        for (int i = 0; i < keyinput.length; i++) {
            if("left".equals(keyinput[i])){
                if(Math.abs(garo-1)<=garoAbs){
                    garo--;
                }
            }else if("right".equals(keyinput[i])){
                if(Math.abs(garo+1)<=garoAbs){
                    garo++;
                }
            }else if("up".equals(keyinput[i])){
                if(Math.abs(sero+1)<=seroAbs){
                    sero++;
                }
            }else if("down".equals(keyinput[i])){
                if(Math.abs(sero-1)<=seroAbs){
                    sero--;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = (Math.abs(garo)>garoAbs ? (garo<0 ? -garoAbs:garoAbs) : garo );
        answer[1] = (Math.abs(sero)>seroAbs ? (sero<0 ? -seroAbs:seroAbs) : sero );
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
