package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _5명씩 {
    String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
    @Test
    public void test() {
        int cnt = 0;
        List<String> list = new ArrayList<>();
        while(cnt<names.length){
            list.add(names[cnt]);
            cnt += 5;
        }
        String[] answer = list.toArray(new String[0]);
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
