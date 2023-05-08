package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 대소문자바꿔서출력하기 {
    String str = "aBcDeFg";
    @Test
    public void test() {
        String[] arr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                arr[i] = Character.toLowerCase(str.charAt(i))+"";
            }else{
                arr[i] = Character.toUpperCase(str.charAt(i))+"";
            }
        }
        String answer = String.join("",arr);
        System.out.println(answer);
        assertThat(true);

    }
}
