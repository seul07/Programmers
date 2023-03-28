package com.example.programmers.level1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.LIST;

public class 비밀지도 {
    int n = 5;
    int[] arr1 = {9,20,28,18,11};
    int[] arr2 = {30,1,21,17,28};

    @Test
    public void test() {
        String[] arr3 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            String binary = Integer.toBinaryString(arr1[i]);
            if(binary.length()!=n){
                binary = String.format("%0"+n+"d",Integer.parseInt(binary));
            }
            arr3[i] = binary;
        }


        String[] arr4 = new String[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            String binary = Integer.toBinaryString(arr2[i]);
            if(binary.length()!=n){
                binary = String.format("%0"+n+"d",Integer.parseInt(binary));
            }
            arr4[i] = binary;
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr3.length; i++) {
            String tmp = "";
            for (int j = 0; j < arr3[i].length(); j++) {
                String s1 = arr3[i];
                String s2 = arr4[i];
                if(s1.charAt(j)=='1' || s2.charAt(j)=='1'){
                    tmp += "#";
                }else if(s1.charAt(j)=='0' || s2.charAt(j)=='0'){
                    tmp += " ";
                }
            }
            list.add(tmp);
        }

        String[] result = list.stream().toArray(String[]::new);


        assertThat(true);
    }
}
