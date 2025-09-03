package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class 컨트롤제트 {
    String s = "1 1 Z Z";
    @Test
    public void test() {
        String[] arr = s.split(" ");
        int answer = 0;

        Stack<String> stack = new Stack<String>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("Z") ){
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        while(!stack.empty()) {
            answer += Integer.parseInt(stack.pop());
        }
        System.out.println(answer);
        assertThat(true);
    }
}
