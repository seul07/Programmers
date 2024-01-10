package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

public class 문자개수세기 {
    String my_string = "Programmers";
    // 65 A  90 Z
    // 97 a  122 z
    @Test
    public void test() {
        int[] result = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i)>=65 && my_string.charAt(i)<=90){
                result[my_string.charAt(i)-65]++;
            }else if(my_string.charAt(i)>=97 && my_string.charAt(i)<=122){
                result[my_string.charAt(i)-97+26]++;
            }
        }
    }
}
