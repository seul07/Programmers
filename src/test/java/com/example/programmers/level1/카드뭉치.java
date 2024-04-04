package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 카드뭉치 {
    String[] cards1 = {"i", "drink", "water"};
    String[] cards2 = {"want", "to"};
    String[] goal = {"i", "want", "to", "drink", "water"};
    @Test
    public void test() {
        List<String> list1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> list2 = new ArrayList<>(Arrays.asList(cards2));
        String answer = "Yes";
        for (int i = 0; i < goal.length; i++) {
            if(list1.size()>0 && goal[i].equals(list1.get(0))){
                list1.remove(0);
            }else if(list2.size()>0 && goal[i].equals(list2.get(0))){
                list2.remove(0);
            }else{
                answer = "No";
                break;
            }
        }
    }
}
