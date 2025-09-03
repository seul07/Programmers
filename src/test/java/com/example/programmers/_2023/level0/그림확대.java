package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class 그림확대 {
    String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
    int k = 2;
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            String tmp = "";
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    tmp += picture[i].charAt(j);
                }
            }
            for (int j = 0; j < k; j++) {
                list.add(tmp);
            }
        }

        String[] answer = list.stream().toArray(String[]::new);
    }
}
