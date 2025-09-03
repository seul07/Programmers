package com.example.programmers._2023.level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class 추억점수 {
    String[] name = {"may", "kein", "kain", "radi"};
    int[] yearning = {5, 10, 1, 3};
    String[][] photo = {{"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}};
    @Test
    public void test() {
        Map map = new HashMap();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i],yearning[i]);
        }
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                Object m = map.get(photo[i][j]);
                if(m!=null){
                    int tmp = (int) map.get(photo[i][j]);
                    sum += tmp;
                }

            }
            answer[i] = sum;
        }
        System.out.println(Arrays.toString(answer));
    }
}
