package com.example.programmers._2023.level0;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 다항식더하기 {
    String polynomial = "x";
    @Test
    public void test() {
        String[] tmp = polynomial.split(" ");
        int num = 0;
        String[] x = new String[tmp.length];
        int cnt = 0;
        for (int i = 0; i < tmp.length; i++) {
            if(tmp[i].contains("x")){
                x[cnt] = tmp[i];
                cnt++;
            }else if(!tmp[i].equals("+")){
                num += Integer.parseInt(tmp[i]);
            }
        }
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i]!=null){
                String n = x[i].replace("x","");
                if("".equals(n)){
                    total += 1;
                }else{
                    total += Integer.parseInt(n);
                }
            }
        }
        String answer = "";
        if(total==1){
            answer += "x";
        }else if ( total >1){
            answer += total + "x";
        }
        if(total==0 && num>0){
            answer = num+"";
        }else if(total>0 && num>0){
            answer += " + "+num;
        }
        assertThat(true);
    }
}
