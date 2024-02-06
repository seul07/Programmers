package com.example.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 코드처리하기 {
    String code = "abc1abc1abc";
    @Test
    public void test() {
        String ret = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if(mode==0){
                if(code.charAt(i)=='1'){
                    mode = 1;
                }else{
                    if(i%2==0){
                        ret += code.charAt(i);
                    }
                }
            }else if(mode==1){
                if(code.charAt(i)=='1'){
                    mode = 0;
                }else{
                    if(i%2!=0){
                        ret += code.charAt(i);
                    }
                }
            }
        }
        if(ret.length()==0){
            ret = "EMPTY";
        }
        System.out.println(ret);
    }
}
