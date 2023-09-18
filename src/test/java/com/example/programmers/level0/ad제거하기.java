package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ad제거하기 {
    String[] strArr = {"and","notad","abcd"};
    @Test
    public void test() {
        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        list.removeIf(str -> str.contains("ad"));
        String[] answer = new String[list.size()];
        list.toArray(answer);
    }
}
