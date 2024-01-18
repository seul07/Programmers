package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

public class 조건문자열 {
    String ineq = "<";
    String eq = "=";
    int n = 20;
    int m = 50;

    @Test
    public void test() {
        int answer = 0;
        if(">".equals(ineq) && "=".equals(eq)){
            if(n>=m){
                answer = 1;
            }
        }else if("<".equals(ineq) && "=".equals(eq)){
            if(n<=m){
                answer = 1;
            }
        }else if(">".equals(ineq) && "!".equals(eq)){
            if(n>m){
                answer = 1;
            }
        }else if("<".equals(ineq) && "!".equals(eq)){
            if(n<m){
                answer = 1;
            }
        }
        System.out.println(1);
    }
}
