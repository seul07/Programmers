package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class 모스부호 {
    String letter = ".... . .-.. .-.. ---";
    @Test
    public void test() {
        Map<String, String> map = new HashMap<>();
        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");
        String answer = "";
        String[] arr = letter.split(" ");

        for (int i = 0; i < arr.length; i++) {
            answer += map.get(arr[i]);
        }

        System.out.println(answer);
        assertThat(true);
    }
}
