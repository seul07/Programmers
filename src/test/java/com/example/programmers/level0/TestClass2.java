package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TestClass2 {
    int[] array = new int[]{9, -1, 0};
    @Test
    public void test() {
        Arrays.sort(array);
        int mid = array.length%2==0 ? array.length/2-1 : array.length/2;
        System.out.println(mid);
        System.out.println(array[mid]);
        assertThat(true);
    }
}

