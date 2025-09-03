package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class n개간격의원소들 {
    int[] num_list = {4, 2, 6, 1, 7, 6};
    int n = 2;
    @Test
    public void test() {
        List<Integer> tmp = new ArrayList<>();
        int cnt = 0;
        while(cnt<num_list.length){
            tmp.add(num_list[cnt]);
            cnt +=n;
        }
        int[] answer = tmp.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
        assertThat(true);
    }
}
