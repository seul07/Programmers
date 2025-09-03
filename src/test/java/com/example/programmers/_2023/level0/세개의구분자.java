package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class 세개의구분자 {
    String myStr = "baconlettucetomato";
    @Test
    public void test() {
        String[] arr = myStr.split("");
        for (int i = 0; i < arr.length; i++) {
            if("a".equals(arr[i]) || "b".equals(arr[i]) || "c".equals(arr[i])){
                arr[i] = "";
            }
        }
        List<String> list = new ArrayList<>();
        String tmp = "";
        for (int i = 0; i < arr.length; i++) {
            if(!"".equals(arr[i])){
                tmp += arr[i];
            }else{
                if(!"".equals(tmp)){
                    list.add(tmp);
                }
                tmp = "";
            }
        }
        if(!"".equals(tmp)){
            list.add(tmp);
        }
        if(list.size()==0){
            list.add("EMPTY");
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        assertThat(true);
    }
}
