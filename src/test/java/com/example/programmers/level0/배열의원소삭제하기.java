package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class 배열의원소삭제하기 {
    int[] arr = {293, 1000, 395, 678, 94};
    int[] delete_list = {94, 777, 104, 1000, 1, 12};
    @Test
    public void test() {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        for (int j = 0; j < deleteList.size(); j++) {
            for (int i = 0; i < arrList.size(); i++) {
                if(deleteList.get(j).equals(arrList.get(i))){
                    arrList.remove(i);
                    break;
                }
            }
        }
        assertThat(true);
    }
}
